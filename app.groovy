
@RestController
class ThisWillActuallyRun {
    @RequestMapping("/")
    String home(){
        return "<h1>Hello World!!</h1>"
    }

    @RequestMapping("/christmas/")
    String christmas(){
        return "<h1>It's christmas time again !!!!!!!"
    }


}