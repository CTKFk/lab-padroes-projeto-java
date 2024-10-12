// File: /c:/Users/caiot/OneDrive/Área de Trabalho/Dio-bootcamp-claro/lab-padroes-projeto-java/src/Main.java

class Subsystem1 {
    public void operation1() {
        System.out.println("Subsystem1: Operation 1");
    }
}

class Subsystem2 {
    public void operation2() {
        System.out.println("Subsystem2: Operation 2");
    }
}

class Subsystem3 {
    public void operation3() {
        System.out.println("Subsystem3: Operation 3");
    }
}

class Info {
    private String cep;
    private String crm;
    private String complemento;

    public Info(String cep, String crm, String complemento) {
        this.cep = cep;
        this.crm = crm;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCrm() {
        return crm;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}

class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;
    private Info info;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
        info = new Info("12345-678", "CRM123456", "Apt 101");
    }

    public void operationA() {
        System.out.println("Facade: Operation A");
        subsystem1.operation1();
        subsystem2.operation2();
    }

    public void operationB() {
        System.out.println("Facade: Operation B");
        subsystem2.operation2();
        subsystem3.operation3();
    }

    public Subsystem1 getSubsystem1() {
        return subsystem1;
    }

    public void setSubsystem1(Subsystem1 subsystem1) {
        this.subsystem1 = subsystem1;
    }

    public Subsystem2 getSubsystem2() {
        return subsystem2;
    }

    public void setSubsystem2(Subsystem2 subsystem2) {
        this.subsystem2 = subsystem2;
    }

    public Subsystem3 getSubsystem3() {
        return subsystem3;
    }

    public void setSubsystem3(Subsystem3 subsystem3) {
        this.subsystem3 = subsystem3;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operationA();
        facade.operationB();

        Info info = facade.getInfo();
        System.out.println("CEP: " + info.getCep());
        System.out.println("CRM: " + info.getCrm());
        System.out.println("Complemento: " + info.getComplemento());
    }
}
