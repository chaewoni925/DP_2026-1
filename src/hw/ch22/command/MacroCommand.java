package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열
    private Deque<Command> commands = new ArrayDeque<>();
    // Undo된 명령을 임시 보관하는 Deque (Step 1)
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    // 실행 (Step 4: descendingIterator로 꼬리부터 순서대로 실행)
    @Override
    public void execute() {
        Iterator<Command> it = commands.descendingIterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    // 추가
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
        // 새 명령이 추가되면 redo 이력 초기화
        commandsForRedo.clear();
    }

    // 마지막 명령을 삭제하고 redo 스택에 보관 (Step 2)
    public void undo() {
        if (!commands.isEmpty()) {
            commandsForRedo.push(commands.pop());
        }
    }

    // redo 스택에서 꺼내어 commands에 복원 (Step 3)
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            commands.push(commandsForRedo.pop());
        }
    }

    // 전부 삭제 (Step 5: commandsForRedo도 함께 비우기)
    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}