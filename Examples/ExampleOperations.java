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
        System.out.println("-------------------------------------------------------------------------------");

        boolean testVar1 = true, testVar2;
        System.out.println("testVar1 :\t" + testVar1);

        testVar2 = ((2 < 0) | (1 > 0));
        System.out.println("testVar2 | :\t" + testVar2);
        testVar2 = ((2 < 0) & (1 > 0));
        System.out.println("testVar2 & :\t" + testVar2);
        testVar2 = ((2 < 0) || (1 > 0));
        System.out.println("testVar2 || :\t" + testVar2);
        testVar2 = ((2 < 0) && (1 > 0));
        System.out.println("testVar2 && :\t" + testVar2);
        System.out.println("-------------------------------------------------------------------------------");

        int counter = 0;
        testVar2 = ((2 < 0) | (counter++ > 0));
        System.out.println("testVar2 | :\t" + testVar2);
        System.out.println("counter :\t" + counter);
        testVar2 = ((2 < 0) & (counter++ > 0));
        System.out.println("testVar2 & :\t" + testVar2);
        System.out.println("counter :\t" + counter);
        testVar2 = ((2 < 0) || (counter++ > 0));
        System.out.println("testVar2 || :\t" + testVar2);
        System.out.println("counter :\t" + counter);
        testVar2 = ((2 < 0) && (counter++ > 0));
        System.out.println("testVar2 && :\t" + testVar2);
        System.out.println("counter :\t" + counter);
        System.out.println("-------------------------------------------------------------------------------");
    }
}
