# demo for typical bugs
## Lesson 1
### 使用 equals() 来判断对象是否相等
### 尽量使用 primitives，而不是 boxed primitives

## Lesson 2
### 避免使用 float / double 来表示 money 等需要精确值的地方
### 使用 BigDecimal

## Lesson 3
### 不要忽略 Exceptions
### 不要依赖系统默认的 Locale, 总是定义好我们期望的 Locale
### 当有其他数据类型可以使用时，避免使用 String

## Lesson 4
### 每个 case 最后都要用 break 来结束
### 使用 “switch … case” 时，要带上 default

## Lesson 5
### 使用 String.contains() 时需要特别谨慎
### 当有其他数据类型可以使用时，避免使用 String

## Lesson 6
### 在任何场合，都不要用 java.util.Date
#### 重名：java.sql.Date
#### mutable
#### Not internationalization, toString() 使用了系统默认时区
#### 使用 joda-time
### 尽量使用 immutable class
#### String vs StringBuilder (no more StringBuffer)
### Java is pass by value

## Lesson 7 
### Java 也有内存泄漏
### 什么时候会出现
#### 自己管理内存，比如使用 object array
### 如何处理
#### 清除过期的对象引用