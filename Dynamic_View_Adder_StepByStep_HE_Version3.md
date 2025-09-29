# מדריך שלב-אחרי-שלב: הוספת רכיבים דינמית לאנדרואיד

## הקדמה

במדריך זה תלמדו כיצד להוסיף רכיבי ממשק (כפתורים) לקונסטריינט באופן דינמי באמצעות קוד Java, לא רק ב-XML.  
נתחיל מהבסיס: הוספת כפתור אחד, ואז שניים, ולבסוף יצירת שורה (LinearLayout אופקי) עם מספר כפתורים והוספה לממשק הראשי.

---

## שלב 1: הוספת כפתור אחד דינמית

**1.1 קוד XML**

ב-`activity_main.xml`, צרו מבנה פשוט של LinearLayout אנכי:

```xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/main"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
</LinearLayout>
```

**1.2 הוספת כפתור ב-Java**

ב-`MainActivity.java`, בתוך `onCreate`:

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    LinearLayout mainLayout = findViewById(R.id.main);

    Button btn = new Button(this);
    btn.setText("כפתור חדש!");
    mainLayout.addView(btn);
}
```

**מה נראה?**  
כפתור אחד יופיע במסך.

---

## שלב 2: הוספת שני כפתורים דינמית

הוסיפו קטע זה אחרי הקוד הקודם:

```java
Button btn2 = new Button(this);
btn2.setText("כפתור שני");
mainLayout.addView(btn2);
```

**מה נראה?**  
שני כפתורים אחד מתחת לשני.

---

## שלב 3: למה להשתמש במבנה Layout?

אם תרצו שהכפתורים יופיעו בשורה (צמודים), צריך ליצור LinearLayout אופקי ולהוסיף אליו כפתורים.

---

## שלב 4: יצירת שורה של כפתורים

```java
LinearLayout rowLayout = new LinearLayout(this);
rowLayout.setOrientation(LinearLayout.HORIZONTAL);

Button btnA = new Button(this);
btnA.setText("שורה כפתור 1");
rowLayout.addView(btnA);

Button btnB = new Button(this);
btnB.setText("שורה כפתור 2");
rowLayout.addView(btnB);

mainLayout.addView(rowLayout);
```

**מה נראה?**  
שני כפתורים בשורה אחת (צמודים).

---

## שלב 5: הסבר והעמקה

- מבנה אנכי ראשי (mainLayout) הוא "מדף".
- כל שורה שאתם יוצרים (rowLayout) היא מגש עם כפתורים.
- ניתן להוסיף לולאה ליצירת שורה עם כמה כפתורים שתרצו.

---

## שלב 6: אתגר

- נסו ליצור שורה עם מספר כפתורים בלולאה.
- נסו להוסיף כמה שורות לממשק הראשי.

---

**סיכום**  
הוספת כפתור אחד, שניים, ואז שורה - כך אפשר לבנות ממשק גמיש ודינמי באנדרואיד!