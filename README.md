﻿# SoftwareLabAss3
Report for code:
1. Wrote a test to calculate the area of a rectangle.
2. Implemented the Rectangle class with the computeArea method.
3. Extended the program to allow changing the width and height of the rectangle.
4. Wrote tests for a Square class.
5. Implemented the Square class as a subclass of Rectangle.


 
## سوالات

### سوال 1:
<br>

- اصل SRP: اصل SRP (Single Responsibility Principle) به این معنا است که هر ماژول (یا کلاس) باید یک مسئولیت تنها داشته باشد و تنها به یک دلیل برای تغییر تغییر کند. این اصل به عنوان یکی از اصول اصلی شی گرا تلقی می‌شود، چرا که به ما کمک می‌کند کلاس‌ها را به گونه‌ای طراحی کنیم که تنها یک دلیل و یک مسئولیت داشته باشند. این اصل به تقسیم کد به قطعه‌های کوچکتر و قابل مدیریت‌تر کمک می‌کند و به کاهش پیچیدگی کد کمک می‌کند.
- اصل OCP: اصل OCP (Open/Closed Principle) به این معنا است که کد باید باز برای توسعه باشد و بسته برای تغییر. یعنی می‌توانیم قابلیت‌ها و ویژگی‌های جدید به کد اضافه کنیم بدون اینکه کد موجود را تغییر دهیم. این اصل به تشویق استفاده از ارتباطات غیرمستقیم و از طریق interface برای ایجاد افزونگی‌ها و توسعه کد موجود کمک می‌کند.
- اصل LSP: اصل ISP (Interface Segregation Principle) به این معنا است که قراردادها یا نماهای یک سیستم باید منسجم باشند و به ازای هر کاربرد تنها آن چیزهایی که نیاز است باید ارائه شود. این اصل به جلوگیری از نماهای بزرگ و ناکارآمد کمک می‌کند و به تقسیم قرارداد به بخش‌های کوچکتر و منسجم‌تر کمک می‌کند.
- اصل ISP: این اصل به این مسئله می پردازد که قراردادها یا نماهای یک سیستم، باید به خودی خود نیز منسجم باشند. این اصل موضوع منسجم بودن را حتی در مورد نماهای یک سیستم نیز لازم می داند و توصیه می کند به جای استفاده از یک نمای غیرمنسجم برای کل سیستم، از چندین نمای ریزدانه اما منسجم استفاده کرد.
- اصل DIP: اصل DIP (Dependency Inversion Principle) به معنا است که به جای اتصال مستقیم به کلاس concrete، باید به interface آن متصل شویم و از طریق configuratorها در ران‌تایم کلاس‌ها را که interface مورد نظر را پیاده‌سازی کرده‌اند به کلاس اصلی تزریق کنیم. این اصل به کاهش وابستگی و رعایت اصل OCP کمک می‌کند.
<br>

### سوال 2:
<br>

اصول SOLID (SRP، OCP، LSP، ISP، و DIP) در تمام مراحل چرخه توسعه نرم‌افزار مهم هستند. در مرحله تحلیل، این اصول به تفکیک مسئولیت‌ها و طراحی انسجام کمک می‌کنند. در مرحله طراحی و پیاده‌سازی، این اصول به تشویق به طراحی کد با کیفیت کمک می‌کنند و از پیچیدگی زیاد و وابستگی نسبت به جزئیات خودداری می‌کنند. در مراحل نگهداری و توسعه، این اصول به تضمین ادامه‌پذیری و تغییرات بهتر در کد کمک می‌کنند و از بروز مشکلات ناشی از تغییرات جلوگیری می‌کنند.<br>


### سوال 3:
<br>

خیر، روش توسعه تست محور (TDD) لزوماً با چرخه کلی توسعه نرم افزار در تضاد نیست. چرخه کلی توسعه نرم افزار شامل مراحل تحلیل، طراحی، پیاده سازی، تست و استقرار است. از سوی دیگر، TDD بر روی یک رویکرد خاص برای تست تمرکز دارد. TDD با تمرکز بر واحدهای کوچک و قابل آزمایش کد، یک رویکرد ایجاد افزایشی و تکراری را ترویج می کند و کمک می کند تا اطمینان حاصل شود که کد به طور کامل آزمایش شده است و ویژگی های جدید عملکرد موجود را خراب نمی کند. ابتدا با نوشتن تست، درک واضح‌تری از رفتار مورد نظر به دست می‌آید و می‌توان کدهای ماژولار و قابل نگهداری بیشتری طراحی کرد. در حالی که TDD ممکن است کمی توالی وظایف را در چرخه توسعه عمومی تغییر دهد، اما با آن تناقض ندارد و در واقع هدف آن پیاده‌سازی حداقلی و اطمینان بخش برای تحقق اهداف مورد نظر سیستم است.
<br>

### سوال 4: 
<br>

با توجه به توضیحات داده شده، این کار چندان درست نیست. اما با override کردن متود computeArea و عدم تغییر مقادیر، میتوانستیم نتیجه مطلوب را به دست بیاوریم. اما باز هم اصل LSP را نقض کرده بودیم. هرچند در خروجی این مسئله لحاظ نمی‌شود، اما برای پیشگیری از اتفاقات پیشرو و عمر نرم‌افزار در درازمدت، باید به اصول شی‌گرا وفادار ماند و آنها را  رعایت کرد. قانون مورفی در نرم‌افزار جدی است:).

###سوال 5:

بله، در صورتی که نیازی به تغییر ابعاد مستطیل نداشتید و ابعاد مستطیل ثابت می‌ماند، می‌توانستید مربع را از مستطیل به ارث ببرید. در این صورت، مربع به عنوان یک زیرکلاس از مستطیل می‌تواند از ویژگی‌ها و رفتارهای مشترک با مستطیل بهره‌مند شود.
کد مشترک:
ویژگی‌هایی که برای هر دو شکل (مستطیل و مربع) مشترک است (مثل محاسبه مساحت) در کلاس پایه (Rectangle در اینجا) پیاده‌سازی می‌شود.

ویژگی‌های خاص:
ویژگی‌های خاص به هر شکل متفاوت باید در کلاس‌های مربوطه پیاده‌سازی شوند. در اینجا، اگر مربع نیاز به ویژگی‌های خاصی دارد (مثل طرف یکسان)، آنها در کلاس مربع (Square در اینجا) اضافه می‌شوند.

بررسی مجدد تست‌ها:
تست‌ها باید به‌روز رسانی شوند تا با تغییرات کد مرتبط با وراثت مطابقت داشته باشند.

