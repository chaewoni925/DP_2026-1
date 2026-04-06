package hw.ch04;

public class LicenseCardFactory extends Factory {

    int licenseCounter = 100;
    String baseDate;

    //생성자: LicenseCardFactory 객체를 만들 때 발급 기준 날짜를 받아서 저장해두는 역할
    public LicenseCardFactory(String baseDate) {
            this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {  // exprityDate=만료일 , Integer.parseInt는 문자열을 정수로 변환하는 메서드
        String expiryDate = (Integer.parseInt(baseDate.substring(0, 4)) + 5) + baseDate.substring(4);
            return new LicenseCard(owner, licenseCounter++, baseDate, expiryDate);
    }
    
    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }

  }
