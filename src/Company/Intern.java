package Company;

public class Intern extends Role{

    /**
     * <img src="../check-pass.png">
     */
    public Intern(String name, int age) {
        super(name, age);
    }

    /**
     * <img src="../check-pass.png">
     */
    @Override
    public String task() {
        return "print document";
    }

    /**
     * <img src="../check-fail.png">
     * <p color="#F88379">บรรทัดล่างไม่จำเป็นต้องมี เป็นการสร้างมาเสียเปล่า</p>
     * <p color="gray">เพราะ จะเห็นว่าถึงเราประกาศ method มาแต่เราก็ไปเรียก method 'อันเดิม'<br>
     * มาทำงาน เท่ากับว่าเหมือนเรา <span color="white">"เขียนทับ method เดิมด้วยเนื้อหาเดิม"</span> ทั้งๆที่<br>มันควรจะ <span color="white">"เขียนทับ method เดิมด้วยเนื้อหาใหม่"</span></p>
     *<br>
     * <p color="yellow">ถ้าอยากเขียนทับให้ displayAll() แล้วถูกตามหลัก</p>
     * <p color="gray">ต้องมองหาก่อนว่าเราอยากจะให้มันทำงานต่างจาก method เดิมยังไง อย่างปกติ
     * มันจะแค่แสดงข้อความ "name, age" เราอาจจะเพิ่มข้อความว่า " I'm Intern" เข้าไปทำให้ทีนี้ Intern เวลาเรียก method นี้จะแสดงบอกเพิ่มว่าเราเป็นเด็กใหม่</p><br>
     * <pre style="background: black; color: white">
     *
     *  <span color="9376E0">public void</span> <span color="white">displayAll() {</span>
     *     <span color="F3BCC8">super</span>.displayAll();                   <span color="F3BCC8">// เรียกข้อความเก่ามาแสดง</span>
     *     System.<span color="F6FFA6">out</span>.println(<span color="E893CF">"I'm Intern."</span>);    <span color="F3BCC8">// สร้างข้อความใหม่</span>
     *  }
     * </pre>
     */

    @Override
    public void displayAll() {
        super.displayAll(); // <--- ตรงนี้จะเห็นว่าเราเรียก method เดิมมาทำงานอย่างเดียว
    }




}
