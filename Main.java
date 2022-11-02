public class Main {
    public static void main(String[] args){
        var factory = AbstractFactory.getRandomFactory();
        var circle = factory.getCircle();
        var triangle = factory.getTriangle();

        circle.information();
        triangle.information();
    }

    /*<?xml version="1.0" encoding="UTF-8"?>
<module type="GENERAL_MODULE" version="4">
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://$MODULE_DIR$" />
    <orderEntry type="sourceFolder" forTests="false" />
  </component>
</module>*/
}
