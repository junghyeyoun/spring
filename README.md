![header](https://capsule-render.vercel.app/api?type=rounded&color=F9F5C5&height=250&section=header&text=spring&fontSize=80&fontColor=705A64&stroke=3A2F32&strokeWidth=2&animation=blinking)
<a href="https://hits.seeyoufarm.com"><img src="https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fjunghyeyoun%2Fspring.git&count_bg=%23EDF1DA&title_bg=%23EDF172&icon=github.svg&icon_color=%23E7E7E7&title=hits&edge_flat=false"/></a>
# 📌 프레임워크


 **프레임워크란?**  소포트웨어나 애플리케이션 개발을 간단하게 해주는 뼈대라고 할 수 있다. 프레임워크를 사용하면 개발에 필요한 최소한의 기능을 제공하기 때무에 자신이 모든 기능을 작성할 필요가 없고, 애플리케이션 개발에 필요한 시간과 비용을 줄이고 유지보수까지 좋다는 장점을 가지고 있다.

 **스프링 프레임워크란?**  자바 개발 환경에서 사용되는 프레임워크이다. 줄여서 스프링이라고도 한다. 스프링 프레임워크에서는 개발을 편리하게 해주기 위한 여러가지 기능을 제공한다. 
![](https://velog.velcdn.com/images/tnsida315/post/f7f2dfb2-0787-4b42-8196-b9b4d48359d0/image.png)
 스프링 부트, 스프링 MVC, 스프링 데이터, 스프링 DI, 스프링 AOP 등 여러가지 기능을 제공한다. ~~(✏ 이부분에 대한 내용들은 천천히 포스팅을 올리겠다.)~~
 
 스프링 프레임워크에 대해 공부하기에 앞서 기존에 쓰던 eclipse, visualStudio 등의 도구와 별개로 spring을 위한 도구를 설치해야 한다. ✏ https://spring.io/tools
 
 
# 📌 DI (Dependency Injection)

 스프링에서의 핵심 기능은 의존성 주입과 관점 지향 프로그래밍이다. 요번 포스팅에서는 의존성 주입에 대해 알아 보겠다.
 
 **의존성 주입이란?**  약어로 DI (Dependency Injection) 라고도 부르며, 의존하는 부분을 외부에서 주입한다라는 뜻이다. 
어떤 프로그램에서 '사용하는 객체 A'와 '사용되는 객체 B'가 있다고 가정하면 A 클래스에서 B 클래스를 사용하기 위해 new 키워드를 이용해서 B 클래스의 인스턴스를 생성하고 B 클래스의 메소드를 사용할 수 있게 된다. 이런 관계를 'A 클래스가 B 클래스에 의존한다' 라고 할 수 있다.

## 📕 DI의 규칙
> 1. 인터페이스를 사용하여 의존성을 만든다.
2. 인스턴스를 명시적으로 생성하지 않는다.
3. 어노테이션을 클래스에 부여한다.
4. 스프링 프레임워크에서 인스턴스를 생성한다.
5. 인스턴스를 이용하고 싶은 곳에 어노테이션을 부여한다.

  자세한 내용 ✏ https://velog.io/write?id=636cdf33-00b2-4e14-9736-4c7695cf4b7a

# 📌 Annotation
**Annotation이란?** 어노테이션의 사전적 의미는 주석이란 뜻으로, 자바에서의 Annotation은 코드 사이에 주석처럼 쓰이며 특별한 의미, 기능을 수행하도록 하는 기술이다.
@xxx 형태로 작성하며 외부 소프트웨어에 필요한 처리 내용을 전달한다.
DI는 xml에 의존적이다. 하지만, Annotation을 쓴다면 xml의 역할아 축소된다. 그렇기 때문에 생성 및 제거가 편리하다고 할 수 있다. Annotation 보다 init.xml이 우선순위가 먼저이다.

  자세한 내용 ✏ https://velog.io/@tnsida315/Spring-Annotation

# 📌 AOP란?
AOP란? Aspect Oriented Programing(관계 지향 프로그래밍)의 약어이다. AOP는 다음 두가지 요소로 구성된다고 할 수 있다.
1. 중심적 관심사 : 실현해야하는 기능
2. 횡단적 관심사 : 실현하는 프로그램과 별도로 부수적으로 필요한 프로그램
간단하게 설명하자면, 공통 처리 등의 '횡단적 관심사' 를 추출하고 프로그램의 여러 곳에서 호출할 수 있게 설정함으로써 개발자는 실현해야 할 기능인 '중심적 관심사' 에만 집중해서 작성하면 되는 구조이다.

  자세한 내용 ✏ https://velog.io/@tnsida315/Spring-AOP

