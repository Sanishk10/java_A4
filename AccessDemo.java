class AccessDemo {
    public String publicData = "PUBLIC: accessible from anywhere";
    private String privateData = "PRIVATE: accessible only inside this class";
    protected String protectedData = "PROTECTED: accessible in same package/subclasses";

    public void insideClassAccess() {
        System.out.println(publicData);
        System.out.println(privateData);
        System.out.println(protectedData);
    }
}

class AccessChild extends AccessDemo {
    public void childAccess() {
        System.out.println("Subclass -> " + publicData);
        System.out.println("Subclass -> " + protectedData);
        // privateData cannot be accessed directly here.
    }
}
