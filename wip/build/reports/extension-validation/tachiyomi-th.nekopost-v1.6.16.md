# Extension Validation Report

- Extension: tachiyomi-th.nekopost-v1.6.16
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 0
- Warnings: 2
- Skipped: 6
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4353470354941192417
- Source name: Nekopost
- Source language: th
- Selected manga input: popular offset 0: ราชาแห่งรังอสูร~ หนุ่มซิงผู้มีชีวิตเหลือเพียงหนึ่งเดือน จะขอสร้างฮาเร็มสาวน้อยเวทมนตร์และตั้งตนเป็นราชา | Makutsu no Ou ~Yomei Ikkagetsu no Doutei, Mahou Shoujo Harem o Kizuite Ou e Kunrinsu~ (`.../15026`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | ราชาแห่งรังอสูร~ หนุ่มซิงผู้มีชีวิตเหลือเพียงหนึ่งเดือน จะขอสร้างฮาเร็มสาวน้อยเวทมนตร์และตั้งตนเป็นราชา | Makutsu no Ou ~Yomei Ikkagetsu no Doutei, Mahou Shoujo Harem o Kizuite Ou e Kunrinsu~ (`.../15026`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | ราชาแห่งรังอสูร~ หนุ่มซิงผู้มีชีวิตเหลือเพียงหนึ่งเดือน จะขอสร้างฮาเร็มสาวน้อยเวทมนตร์และตั้งตนเป็นราชา | Makutsu no Ou ~Yomei Ikkagetsu no Doutei, Mahou Shoujo Harem o Kizuite Ou e Kunrinsu~ (`.../15026`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | ยูริ100วัน (`.../17973`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ราชาแห่งรังอสูร~ หนุ่มซิงผู้มีชีวิตเหลือเพียงหนึ่งเดือน จะขอสร้างฮาเร็มสาวน้อยเวทมนตร์และตั้งตนเป็นราชา | Makutsu no Ou ~Yomei Ikkagetsu no Doutei, Mahou Shoujo Harem o Kizuite Ou e Kunrinsu~ (`.../15026`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ราชาแห่งรังอสูร~ หนุ่มซิงผู้มีชีวิตเหลือเพียงหนึ่งเดือน จะขอสร้างฮาเร็มสาวน้อยเวทมนตร์และตั้งตนเป็นราชา | Makutsu no Ou ~Yomei Ikkagetsu no Doutei, Mahou Shoujo Harem o Kizuite Ou e Kunrinsu~ (`.../15026`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | ตอนที่ 1 ชายผู้ไปยังต่างโลก (`.../15026_169787.json`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 249: Expected quotation mark '"', but had '1' instead at path: \$.pageItem\[0\].pageNo<br>JSON input: .....,"pageItem":\[{"id":1,"pageNo":1,"pageName":"169787_202503140..... | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 249: Expected quotation mark '"', but had '1' instead at path: \$.pageItem\[0\].pageNo<br>JSON input: .....,"pageItem":\[{"id":1,"pageNo":1,"pageName":"169787_202503140..... | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ราชาแห่งรังอสูร~ หนุ่มซิงผู้มีชีวิตเหลือเพียงหนึ่งเดือน จะขอสร้างฮาเร็มสาวน้อยเวทมนตร์และตั้งตนเป็นราชา \| Makutsu no Ou ~Yomei Ikkagetsu no Doutei, Mahou Shoujo Harem o Kizuite Ou e Kunrinsu~, URL=`15026` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=คามิอินะ โบตั๋น งดงามดั่งดอกลิลลี่ยามลอยละล่อง, URL=`18149` at page 1 offset 4 and page 2 offset 9 |  |  |  |
| listing duplicates | FAIL | Latest page 2 repeats 1 manga entry: title=อดีตทาสสร้างฮาเร็มด้วยสกิล พันแปรหมื่นผัน! Tensei shita moto dorei, “senpenbanka” de saikyou haremu o tsukuru!  , URL=`16304` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.osemocphoto.com/.../15026_cover.jpg <redacted query values: ver>` (image/jpeg, 846619 bytes, 1500x2133) |  |  |  |
| details identity | PASS | Details preserved selected URL `15026` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.osemocphoto.com/.../15026_cover.jpg` (image/jpeg, 846619 bytes, 1500x2133) |  |  |  |
| details author | PASS | nekomikozukini / ネコミコズッキーニ |  |  |  |
| details artist | PASS | Shiro Fugu / 白フグ |  |  |  |
| details genres | PASS | Comedy, Fantasy, Harem, Isekai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ชิมิสึ โชอิจิ หนุ่มซิงที่ได้ถูกส่งไปยังต่างโลกและกำลังเดินหลงทางในป่าที่เต็มไปด้วยสัตว์อสูร<br>ได้รับการช่วยชีวิตโดยภูตแสนน่ารัก นามว่า อามี่จัง แถมยังได้รับสกิลพิเศษเพื่อใช้เอาตัวรอดในต่างโลก<br>แต่ต้องแลกกับการมีร่างกายที่ "จะต้องทำให้ผู้หญิงถึงจุดสุดยอดเดือนละครั้ง ไม่อย่างนั้นจะตาย!" |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Unexpected JSON token at offset 249: Expected quotation mark '"', but had '1' instead at path: \$.pageItem\[0\].pageNo<br>JSON input: .....,"pageItem":\[{"id":1,"pageNo":1,"pageName":"169787_202503140..... |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
