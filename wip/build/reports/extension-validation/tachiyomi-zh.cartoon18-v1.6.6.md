# Extension Validation Report

- Extension: tachiyomi-zh.cartoon18-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 28664779574072063
- Source name: Cartoon18
- Source language: zh
- Selected manga input: popular offset 0: 秘密教学 (`.../kweLM`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 秘密教学 (`.../kweLM`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 迷走都市0-3(终) [小说改编]【国产真人漫画.../%E6%98%8E%E6%98%9FPS%E3%80%91 (`.../9Dyml`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | [ジュースボックス工场 (ジュナジュナジュース)] 仆のハーレムアカデミア８话：彼女たちの决心（前编） (`.../zDvlr`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [色孽神选] 镜世界浮士德改造计划(上） (`.../r4g2x`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | [アンソロジー] 双人教学 (`.../pKQkr`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 秘密教学 (`.../kweLM`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | 01话 (`.../full`) |  | <1s |
| pages | `getPageList(chapter)` | success | 125 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 24 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=被NTR的女朋友 \[Chinese\] \[りふれぼコミック (ひなた悠)\] NTRカノジョ, URL=`.../d7lNo` at page 1 offset 1 and page 2 offset 18, title=想驯服老师什么的，果然是我想错了 \[MTL\] \[白饼あつつ\]先生を躾けようなんて仆が间违ってました, URL=`.../MGk74` at page 1 offset 4 and page 2 offset 16, title=“秘密屋”爆乳姐妹、丰腴熟女妈妈…将一家全部彻底堕落并恩爱相处的故事, URL=`.../QGkr0` at page 1 offset 10 and page 2 offset 15, title=\[CHOMA\] 雌ドレイ宣誓, URL=`.../8m15K` at page 1 offset 12 and page 2 offset 17, title=\[parapluie (雨野しぐれ)\] 廃墟で地雷女子と夜中じゅう中出しセックスした话2, URL=`.../ErV7d` at page 1 offset 14 and page 2 offset 6, title=\[汁っけの多い柘榴 (桐生寺 リュウジ)\] デスゲーム部屋がセックスをしないと出られない部屋になったので集めた男达にゲームマスターJKが犯●れまくる话, URL=`.../g7A8q` at page 1 offset 15 and page 2 offset 7, title=\[GaryLin\] Minegumo Mama, URL=`.../AKwgq` at page 1 offset 16 and page 2 offset 8, title=\[Ryx\] 诀-黎博利女孩下蛋手册, URL=`.../7yeEm` at page 1 offset 17 and page 2 offset 9, title=相思有毒\[莉赛特汉化组\] \[ポリー\] 恋の病に毒あり？, URL=`.../P1y7w` at page 1 offset 18 and page 2 offset 10, title=异世界ハーレム物语 小册子, URL=`.../GgklL` at page 1 offset 19 and page 2 offset 11, title=\[ジュナジュナジュース\] 直美さんは俺のセフレ, URL=`.../mBGWl` at page 1 offset 20 and page 2 offset 12, title=\[komachan\] 芙莉莲的大败北 特别篇-续, URL=`.../lBXwn` at page 1 offset 21 and page 2 offset 13, title=\[ジュナジュナジュース\] 直美さん落书き, URL=`.../oGyaD` at page 1 offset 22 and page 2 offset 14, title=欢迎光临治 (纵) 欲系咖啡馆!\[琥珀汉化组\] \[Digital\] \[ぽんこっちゃん\] 愈や (ら) し吃茶へようこそ!, URL=`.../261wZ` at page 1 offset 23 and page 2 offset 19 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.cartoon18.com/.../134927.avif <redacted query values: 20211205224045>` (image/avif (format: avif), 12966 bytes, 400x534) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kweLM` |  |  |  |
| details thumbnail URL | PASS | `https://img.cartoon18.com/.../134927.avif <redacted query values: 20211205224045>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 13岁那年成为孤儿的子豪，被爸爸的朋友收养。然而成年后的子豪却对男女交往一无所知，阿姨与姐姐们决定给纯洁的子豪，来场教学… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | LINT | All 57 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=57 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 125 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.cartoon18.com/.../10650406.avif <redacted query values: 20211129084008>` (image/avif (format: avif), 13936 bytes, 300x420) |  |  |  |
