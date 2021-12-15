# TIL
## 첫 작성입니다.


<em>이건 기울임체 입니다.</em><br>
*별표 1번*<br>
_언더바 1번_

<strong>이건 볼드입니다.</strong><br>
**별표 2번**<br>
__언더바 2번__

<del>이건 취소선 입니다.</del><br>
~~물결 2번~~


***별표 3번 - 기울임과 볼드체... 신기***<br>
**_별표2번_, 언더바 1번 - 기울임과 볼드체 같이 사용하기.** 

<u>밑줄</u>


---
<!-- ////////////////////////////// -->

1. 한식
1. 양식
    - 스파게티
    - 피자
1. 일식
    1. 돈카츠
    1. 라멘
1. 중식


- 오늘 할 일
    * 마트 가기
    + 운동 하기
    - 영화 보기
    
___
<!-- ////////////////////////////// -->

[google](https://google.com)

[naver](https://naver.com)

[상대적 참조](../../temp.html)



***
<!-- ////////////////////////////// -->
인용문

> 완벽한 것보다 하는 게 낫다.
>_- me_

> 완벽한 것보다 하는 게 낫다.
>> 완벽한 것보다 하는 게 낫다
>>> 완벽한 것보다 하는 게 낫다
>>> 완벽한 것보다 하는 게 낫다


***
<!-- ////////////////////////////// -->
코드 작성

```html
<a href="https://www.google.co.kr/" target="_blank">GOOGLE</a>
```

```css
.list > li {
  position: absolute;
  top: 40px;
}
```

```javascript
function func() {
  var a = 'AAA';
  return a;
}
```

```bash
$ vim ./~zshrc
```

```python
s = "Python syntax highlighting"
print s
```

```
No language indicated, so no syntax highlighting. 
But let's throw in a tag.
```

```java
public class Member{
    private int memIdx;
    private String name;
    private int age;
    private String nickname;
    private String job;

    public int getMemIdx(int memIdx){
        this.memIdx = memIdx;
    }
    
}
```


***
<!-- ////////////////////////////// -->
inline 코드 

`background-image` 에 100 `width` 속성을 주도록 한다.


***
<!-- ////////////////////////////// -->
이미지 첨부하기
- ### 첨부한 사진이 깨졌을 때
![대체 텍스트(alternative text)를 입력하세요!](http://www.auntieannes.co.kr/wp-content/uploads/2020/03/product02_hover_1-min.png "링크 설명(title)을 작성하세요.")

- ### 첨부 방식 1 - 변수 없이 한 줄로 완성
![프레즐](prezle.png "신상품 고구마맛 스틱프레즐")

- ### 첨부 방식 2 - 변수 두개 활용
![프레즐][logo]
[logo]:prezle.png "신상품 고구마맛 스틱프레즐"

- ### 사진에 링크 넣기
[![프레즐](heart.png "cinamon sugar pretzel")](http://auntieannes.co.kr/product-all/?cate=all)




***
마크 다운 참고 사이트 : https://heropy.blog/2017/09/30/markdown/