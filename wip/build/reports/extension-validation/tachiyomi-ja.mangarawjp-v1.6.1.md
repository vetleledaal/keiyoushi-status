# Extension Validation Report

- Extension: tachiyomi-ja.mangarawjp-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3036990057284261953
- Source name: MangaRawJP
- Source language: ja
- Selected manga input: popular offset 0: ブルーロック (`.../blue-lock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | ブルーロック (`.../blue-lock`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | 葬送のフリーレン (`.../frieren`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 王妃様は離婚したい～異世界から聖女様が来たので、もうお役御免ですわね?～ (`.../ouhi-sama-wa-rikon-shitai-isekai-kara-seijo-sama-ga-kita-no-de-mou-oyaku-gomen-desu-wa-ne`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 虐げられた歌姫聖女、かつて助けた王子様に溺愛されています (`.../shiitagerareta-utahime-seijo-katsute-tasuketa-ouji-sama-ni-dekiai-sareteimasu`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | ブルーロック (`.../blue-lock`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ブルーロック (`.../blue-lock`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 375 | 1話 (`.../1-wa`) |  | <1s |
| pages | `getPageList(chapter)` | success | 81 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ブルーロック, URL=`.../blue-lock` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://admin.mangarawjp.net/.../blue-lock.jpg` (image/jpeg, 104177 bytes, 225x337) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../blue-lock` |  |  |  |
| details thumbnail URL | PASS | `https://admin.mangarawjp.net/.../blue-lock.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ドラマ, アクション, スポーツ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 物語は、2018 FIFAワールドカップで日本が敗退したことから始まり、日本サッカー協会は2022年のワールドカップに向けてトレーニングを始める高校生選手をスカウトするプログラムを開始することになった。 The story begins with Japans elimination from the 2018 FIFA World Cup, which prompts the Japanese Football Union to start a programme scouting high school players who will begin training in preparation for the 2022 Cup. Isagi Youichi, a forward, receives an invitation to this programme soon after his team loses the chance to go to Nationals because he passed to his less-skilled teammate - who missed - without trying to make the game-changing goal by himself. Their coach will be Ego Jinpachi, who intends to destroy Japanese loser football by introducing a radical new training regimen: isolate 300 young forwards in a prison-like institution called Blue Lock and put them through rigorous training aimed at creating the worlds greatest egotist striker.<br><br>**Alternative Names:**<br>- Bluelock<br>- Buruu Rokku<br>- ブルーロック<br>- Blue Lock<br>- BLUE LOCK |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 375 chapters |  |  |  |
| chapter dates | PASS | 375 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 81 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bk.mangarawjp.net/.../02.jpg` (image/jpeg, 332318 bytes, 1131x1618) |  |  |  |
