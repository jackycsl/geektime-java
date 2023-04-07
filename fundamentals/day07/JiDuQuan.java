//缉毒犬属于犬科一种，让其继承犬科，获取的犬科的特性，
//由于缉毒犬具有缉毒功能，那么它只要实现缉毒接口即可，这样即保证缉毒犬具备犬科的特性，也拥有了缉毒的功能
class JiDuQuan extends Dog implements JiDu {
  public void jiDu() {
  }

  public void eat() {
  }

  public void roar() {
  }
}
