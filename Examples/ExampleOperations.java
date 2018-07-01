// Example java project for operations test

class ExampleOperations{
    public static void main(String[] args) {
        int vairable = 0xFEEDCAFE;
        System.out.println("Basic variable :\t\t" + String.format("0x%08X", vairable));
        System.out.println("[~] operation :\t\t\t" + String.format("0x%08X", ~(vairable)));
        System.out.println("[>> 16] operation :\t\t" + String.format("0x%08X", (vairable >> 16)));
        System.out.println("[>>> 16] operation :\t\t" + String.format("0x%08X", (vairable >>> 16)));
        System.out.println("[&= 0xFEED0000] operation :\t" + String.format("0x%08X", (vairable &= 0xFEED0000)));
        System.out.println("[|= 0xCAFE] operation :\t\t" + String.format("0x%08X", (vairable |= 0xCAFE)));
        System.out.println("[^= 0xEDCA00] operation :\t" + String.format("0x%08X", (vairable ^= 0xEDCA00)));
    }
}
