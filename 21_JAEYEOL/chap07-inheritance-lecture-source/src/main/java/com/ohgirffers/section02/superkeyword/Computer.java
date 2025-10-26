package com.ohgirffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{

    /*Computer 는 하나의 product 이지만 product 는 computer 가 아니다 , IS-a 관계 성립! */
    private String cpu;
    private int ssd;
    private int ram;
    private String operateionSystem;

    public Computer() {
        System.out.println("Computer 클래스의기본 생성자 호출");

    }


    //super 생성자를 쓰면 자식에서 부모것을 건들 수 있음
    public Computer(String cpu, int ssd, int ram, String operateionSystem) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operateionSystem = operateionSystem;
    }
    /*setter 와 getter 는 부모필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 때문에
    * 따로 작성할 필요 없이 부모 클래스에 작성한것을 사용할 수 있다
    * 따라서 자식 클래스에 추가된 필드에 대해서만 setter/getter 를 작성한다 .*/
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperateionSystem() {
        return operateionSystem;
    }

    public void setOperateionSystem(String operateionSystem) {
        this.operateionSystem = operateionSystem;


    }

    @Override
    public String gerInformation() {

        /*적재 적소에 super 하고 this 쓰는법 알기
        * 예를 들어
        * Super.gerInformation() : 정상적으로 부모의 메소드를 호출
        * This.getInformation() : 본인의 getInformation() 호ㅜㄹ - > 재귀호출이 일어나며  stackoverflow 발생
        * getInformation() : this 이 자동 추가되어 재귀호출이 일어나고 stackoverflow 가 발생
        * 따라서 이런경우 super.을 명시적으로사용*/
        // 슈퍼가 없으면 바로위 getINfor와 무한으로  왔다리갔다리  루프발생
        return super.gerInformation()
        + ",Cpu = " + this.cpu
        + ",Ssd = " + this.ssd
        +",ram = " + this.ram
        +",operateionSystem  = " + this.operateionSystem;
    }

    //컨스트럭쳐 해서 뽑았을때
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int ssd, int ram, String operateionSystem) {
        super(code, brand, name, price, manufacturingDate); // 슈퍼는 항상 최상단에 위치 부모의 매개변수를 잡아주어서 수정 가능
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operateionSystem = operateionSystem;
        // this(cpu,ssd,ram,operateionSystem);
        /*위처럼 this 생성자를 통해 사용하고 싶지만 this 를 호출한다는 의미는 super() 를 2번호출하는 것과 같기 때문에
        * 허용x  부모 인스턴스를 2개 생성 할수 없기때문에 부모생성자는한번만 호출한다.*/


    }
}
