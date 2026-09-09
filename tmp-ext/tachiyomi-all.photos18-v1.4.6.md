# Extension Validation Report

- Extension: tachiyomi-all.photos18-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 225835804698740720
- Source name: Photos18
- Source language: all
- Selected manga input: popular offset 0: [Taste顽味生活]Vol.011_巨乳嫩模Anglica半裸豪乳与蓝色内裤的性感魅影 (`.../4n4n9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | [Taste顽味生活]Vol.011_巨乳嫩模Anglica半裸豪乳与蓝色内裤的性感魅影 (`.../4n4n9`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 100 | 黑巷阿比阳光下的丰盈之姿 (`.../ZRbK8`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | 东云海：盛夏与万圣节特别版高清写真集 (`.../BBRWM`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 100 | 萨隆苦囚cos作品：蝴蝶 (`.../w4Jmw`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 |  (`.../5zkWX`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Taste顽味生活]Vol.011_巨乳嫩模Anglica半裸豪乳与蓝色内裤的性感魅影 (`.../4n4n9`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../4n4n9`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 11: title=\[Taste顽味生活\]Vol.011_巨乳嫩模Anglica半裸豪乳与蓝色内裤的性感魅影, URL=`.../4n4n9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=\[Taste顽味生活\]Vol.011_巨乳嫩模Anglica半裸豪乳与蓝色内裤的性感魅影, URL=`.../4n4n9` at page 1 offset 0 and page 2 offset 8, title=小魔女的诱惑：赵芊羽, URL=`.../2aaqN` at page 1 offset 2 and page 2 offset 60, title=阿雪雪 温泉牛牛, URL=`.../DQRo1` at page 1 offset 3 and page 2 offset 34, title=星颜社·伊黎私房粉蕾丝诱惑写真, URL=`.../Demgn` at page 1 offset 4 and page 2 offset 68, title=轻熟女葵千惠继母的床上诱惑, URL=`.../aNBda` at page 1 offset 6 and page 2 offset 54, title=青豆客2017.11.14_嫩模私房镂空内衣与豪乳乳贴的温柔诱惑, URL=`.../pL9aa` at page 1 offset 8 and page 2 offset 19, title=雅拉伊·白雪初绽, URL=`.../jOe0m` at page 1 offset 11 and page 2 offset 84, title=<blank>, URL=`.../ZYlxX` at page 1 offset 12 and page 2 offset 71, title=星颜社Vol.208：温心怡黑皮情趣内衣与黑丝诱惑写真, URL=`.../KPaeZ` at page 1 offset 15 and page 2 offset 59, title=木村奈菜子：魅惑之躯, URL=`.../ZWJ4d` at page 1 offset 18 and page 2 offset 35, title=百合川飒的私密时光, URL=`.../j7a6V` at page 1 offset 19 and page 2 offset 70, title=小梦风采·2016秋日写真, URL=`.../ZRALA` at page 1 offset 22 and page 2 offset 62, title=老板的温柔诱惑, URL=`.../G6mPq` at page 1 offset 23 and page 2 offset 57, title=<blank>, URL=`.../6Emdl` at page 1 offset 24 and page 2 offset 50, title=苍来流美：刺青少女的纯真诱惑, URL=`.../GjNN4` at page 1 offset 28 and page 2 offset 51, title=女仆杜花花的诱人侍奉, URL=`.../4lY7b` at page 1 offset 30 and page 2 offset 79, title=尤蜜荟Vol.915：模特Laura阿姣泰国泳池畔的白色吊带短裙诱惑写真, URL=`.../D1jzl` at page 1 offset 31 and page 2 offset 76, title=萌香与まい的女仆诱惑, URL=`.../3aEXk` at page 1 offset 34 and page 2 offset 78, title=网络精选情色图集, URL=`.../jQjN4` at page 1 offset 35 and page 2 offset 46, title=<blank>, URL=`.../jzNLm` at page 1 offset 38 and page 2 offset 61, title=修人第2246期：乔伊的私密时光, URL=`.../aRQ5O` at page 1 offset 39 and page 2 offset 52, title=园田美音私密写真, URL=`.../Exk9j` at page 1 offset 41 and page 2 offset 25, title=温柔主妇的隐秘收留, URL=`.../GZ9Jx` at page 1 offset 42 and page 2 offset 81, title=欲望学士再会吉峰东路毕业狂欢, URL=`.../rpYR3` at page 1 offset 43 and page 2 offset 80, title=头条女神刘瑾希：户外白衬衣吊带黑丝透乳诱惑写真, URL=`.../EAj9j` at page 1 offset 44 and page 2 offset 14, title=性感美胸张语昕公然展露, URL=`.../DqoKp` at page 1 offset 49 and page 2 offset 29, title=韩国女团丰臀诱人　台下观众欲火焚身, URL=`.../4NDRk` at page 1 offset 50 and page 2 offset 5, title=长腿巨乳的诱惑时光, URL=`.../ZWdyP` at page 1 offset 52 and page 2 offset 3, title=河音くるみ童颜巨乳美少女生中出し实录, URL=`.../vW1DR` at page 1 offset 57 and page 2 offset 77, title=上原空深邃侧乳撩人心魄, URL=`.../G6AXW` at page 1 offset 59 and page 2 offset 69, title=吉田花的私密时刻, URL=`.../6kRA1` at page 1 offset 60 and page 2 offset 97, title=瑞典名模艾尔莎纯色内衣性感写真, URL=`.../Kb7XB` at page 1 offset 63 and page 2 offset 95, title=跪姿翘臀诱惑姿, URL=`.../pAzaa` at page 1 offset 64 and page 2 offset 36, title=狂热派对之夜：DJ Wei专辑发表盛典, URL=`.../G2OVv` at page 1 offset 65 and page 2 offset 38, title=小泉花阳海军觉醒之恋, URL=`.../DdKzl` at page 1 offset 66 and page 2 offset 33, title=黑巷之谜：米亚的夜色诱惑, URL=`.../6aBL1` at page 1 offset 67 and page 2 offset 23, title=本庄铃与夏目响的闪光时刻, URL=`.../KmL6d` at page 1 offset 69 and page 2 offset 72, title=波萝社王雨纯北京JK制服写真, URL=`.../6kWwZ` at page 1 offset 70 and page 2 offset 28, title=泽井玲菜制服诱惑, URL=`.../K66NY` at page 1 offset 72 and page 2 offset 74, title=西西大尺度私密写真, URL=`.../K662V` at page 1 offset 78 and page 2 offset 43, title=糖果画报：湿吻女神李宓儿的浴中诱惑, URL=`.../DemL8` at page 1 offset 80 and page 2 offset 41, title=黑巷中的米娅盛宴, URL=`.../ZRAAm` at page 1 offset 81 and page 2 offset 2, title=福利姬念念：碧蓝航线欧根亲王的私密时光, URL=`.../G6dYr` at page 1 offset 82 and page 2 offset 26, title=轰趴猫No.112：黑丝裹身的性感尤物，床榻间裸露私密的致命诱惑, URL=`.../2nR21` at page 1 offset 83 and page 2 offset 55, title=朝美穗香脱衣诱惑气质迷人的致命魅惑, URL=`.../pAzqg` at page 1 offset 85 and page 2 offset 22, title=阿松殿下：小豆梓的私密时光, URL=`.../ZRbmX` at page 1 offset 86 and page 2 offset 30, title=小宇画语界：女神Cherry樱桃酱身披红色飘纱，魅惑展现火辣曲线, URL=`.../D1j7V` at page 1 offset 91 and page 2 offset 9, title=黑巷阿比阳光下的丰盈之姿, URL=`.../ZRbK8` at page 1 offset 92 and page 2 offset 0, title=小花火辣身姿 爆乳白皙羞现人前, URL=`.../G62Zl` at page 1 offset 95 and page 2 offset 73, title=优星馆嫩模管珂居家黑衣红唇魅影, URL=`.../WblbB` at page 1 offset 98 and page 2 offset 65, title=雄伟曲线下的美熙甜润巨乳, URL=`.../4l5AV` at page 1 offset 99 and page 2 offset 1 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[Kaame花雨\]【数码限定YJ摄影集】雨音花繁盛, URL=`.../gK9a8` at page 1 offset 80 and page 2 offset 2, title=萨隆苦囚cos作品：蝴蝶, URL=`.../w4Jmw` at page 1 offset 84 and page 2 offset 0, title=\[内购无水印\] 晚苏susu：紫色丝袜, URL=`.../my9bj` at page 1 offset 87 and page 2 offset 6, title=清水凪后辈的制服, URL=`.../xwzlw` at page 1 offset 92 and page 2 offset 8, title=内购无水印王馨瑶Yanni灰蓝色西裤配丝绸上衣, URL=`.../jq8zK` at page 1 offset 94 and page 2 offset 5, title=邦尼角色扮演：金牌门将, URL=`.../oD9lx` at page 1 offset 95 and page 2 offset 3, title=七濑奈奈 数字限定青春写真集, URL=`.../5RJYX` at page 1 offset 98 and page 2 offset 7, title=NIKKE角色Cosplay安尼斯星星星光图集, URL=`.../N4jaz` at page 1 offset 99 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 2: title=<blank>, URL=`.../6EbwZ`, popular entry 13: title=<blank>, URL=`.../ZYlxX`, popular entry 25: title=<blank>, URL=`.../6Emdl`, popular entry 30: title=<blank>, URL=`.../aWEda`, popular entry 39: title=<blank>, URL=`.../jzNLm`, popular entry 54: title=<blank>, URL=`.../jzN6V`, popular entry 63: title=<blank>, URL=`.../DyMXN`, popular entry 91: title=<blank>, URL=`.../ZYlyP`, popular_next entry 7: title=<blank>, URL=`.../EB6AZ`, popular_next entry 51: title=<blank>, URL=`.../6Emdl`, popular_next entry 62: title=<blank>, URL=`.../jzNLm`, popular_next entry 72: title=<blank>, URL=`.../ZYlxX`, popular_next entry 76: title=<blank>, URL=`.../44lo9`, popular_next entry 84: title=<blank>, URL=`.../44dVg`, popular_next entry 90: title=<blank>, URL=`.../EB4Bk`, popular_next entry 99: title=<blank>, URL=`.../44dwy`, search entry 1: title=<blank>, URL=`.../5zkWX`, search entry 2: title=<blank>, URL=`.../ABAaE`, search entry 3: title=<blank>, URL=`.../pL8BW`, search entry 4: title=<blank>, URL=`.../VkL1b`, search entry 5: title=<blank>, URL=`.../bgeYO`, search entry 6: title=<blank>, URL=`.../pLbZo`, search entry 7: title=<blank>, URL=`.../dgA5B`, search entry 8: title=<blank>, URL=`.../WYVKg`, search entry 9: title=<blank>, URL=`.../Onw1q`, search entry 24: title=<blank>, URL=`.../g828d` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 424/424 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.photos18.com/.../786432.avif <redacted query values: 1751276180>` (image/avif (format: avif), 11093 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../4n4n9` |  |  |  |
| details thumbnail URL | PASS | `https://www.photos18.com/.../786432.avif <redacted query values: 1751276180>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 极品美女 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.photos18.com/.../28245315.avif <redacted query values: 0>` (image/avif (format: avif), 26255 bytes, 980x1470) |  |  |  |
