# springwebflux-audio-video-streaming

``http://localhost:8080``
## Check with curl
`` curl http://localhost:8080/video/videoclip -i -H "Range: bytes=0-500"``

``curl http://localhost:8080/audio/music -i -H "Range: bytes=0-500"``

## Check with postman
GET ``http://localhost:8080/audio/music``
*Headers KEY = ``Range``  VALUE = ``bytes=500000-1000000``

GET ``http://localhost:8080/video/videoclip``
*Headers KEY = ``Range``  VALUE = ``bytes=0-10000000``

<img src="https://github.com/mySkillsKit/springwebflux-audio-video-streaming/blob/main/getAudio.JPG" alt="getaudiopostman.jpg">
<img src="https://github.com/mySkillsKit/springwebflux-audio-video-streaming/blob/main/getVideo.JPG" alt="getvideopostman.jpg">


