package Company;

public class Junior extends Role{

    /**
     * <img src="../check-pass.png">
     */
    public Junior(String name, int age) {
        super(name, age);
    }

    /**
     * <img src="../check-pass.png">
     */
    @Override
    public String task() {
        return "Fix bug programming";
    }

    /**
     * <img src="../check-pass.png">
     * <p color="yellow">แนะนำ task() ควรเรียกใช้ตั้งแต่ใน displayAll() ของคลาสแม่</p>
     * <p color="gray">เพราะ ตามตรรกะปกติถ้าเราตั้งใจจะให้ task() ทำงานเพื่อปรินท์ว่าคนนี้ทำงานอะไร ในคำสั่งที่ใช้แสดง<br>
     * ข้อมูลของพนักงาน<span color="B2F6FF">[ displayAll() ]</span> ควรจะให้ปรินท์ task() ออกมา <span color="white">"ทุกพนักงานไม่ว่าจะตำแหน่งไหน"</span></p>
     * <br>
     * <img src="../intern.png">
     * <br>
     * <p color="gray">ดูจากภาพจะเห็นว่าถ้าคนที่เป็น intern อยากดูว่าตัวเองต้องทำงานอะไรกดเข้าฟังก์ชั่น displayAll() ปุ๊ป<br>
     * เขาจะเห็นแค่ <span color="white">"ชื่อ, อายุ"</span> แต่ไม่รู้ว่าตัวเองควรทำงานอะไร ในขณะที่อีก 2 ตำแหน่งเห็น <span color="white">"ชื่อ, อายุ, งานที่ต้องทำ"</span><br>
     * ฉะนั้นแล้ว การที่เราใส่ task() ในคลาสแม่จะช่วยลดเวลาที่เราต้องมาเรียกใช้ task() ในคลาสลูกทุกคลาส</p>
     * <br>
     * <p color="yellow">ถ้าอยากสร้างความแตกต่าง?</p>
     * <p color="gray">มุมมองของตำแหน่งงาน อาจจะสร้างความแตกต่างได้จาก <span color="white">"สิทธิพิเศษของแต่ละตำแหน่ง"</span><br>
     * ยกตัวอย่างเช่น หากเราเป็น Junior ก็จะได้รับสิทธิในการใช้ <span color="white">"ฟิตเนสส่วนตัว"</span> ตามโค้ดตัวอย่างด้านล่าง</p>
     * <br>
     * <pre style="background: black; color: white">
     *
     *<span color="orange">* activeFitness() เป็นแค่ตัวอย่าง ฉะนั้นอย่าใส่ใจกับเนื้อหาข้างใน method มาก</span>
     *
     * <span color="9376E0">void</span> activeFitness() {
     *      System.out.println("You can use fitness!");
     * }
     *
     * <span color="9376E0">public void</span> <span color="white">displayAll() {</span>
     *      <span color="F3BCC8">super</span>.displayAll();              <span color="F3BCC8">// เรียกข้อความเก่ามาแสดง</span>
     *      activeFitness();                 <span color="F3BCC8">// เรียกฟังก์ชั่นใช้งานฟิตเนสมาให้กับตำแหน่งนี้
     *  }
     * </pre>
     *
     */
    @Override
    public void displayAll() {
        super.displayAll();
        task();
    }
}
