# Extension Validation Report

- Extension: tachiyomi-ja.torchcomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1835566331167834452
- Source name: Torch Comics
- Source language: ja
- Selected manga input: popular offset 0: トーチとの遭遇 (`.../encounto-ti`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | トーチとの遭遇 (`.../encounto-ti`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | みどりちゃん、あのね (`.../midorichan`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | トーチとの遭遇 (`.../encounto-ti`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | トーチとの遭遇 (`.../encounto-ti`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | 編集部・吉元『テーマによせて＆作品紹介』 (`.../encounto-ti02_01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=トーチとの遭遇, URL=`encounto-ti` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://to-ti.in/.../b736cb47ba8a2b72f79d5776c1888f23.jpg` (image/gif (format: 89a), 775199 bytes, 1440x712) |  |  |  |
| details identity | PASS | Details preserved selected URL `encounto-ti` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://to-ti.in/.../banner_encounto-ti02.gif` was not downloaded |  |  |  |
| details author | PASS | トーチ編集部 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 第2回「親がえらいと子がこまる」（担当：吉元）<br><br>本企画の第1回「虫のさざめき」が公開されたとき、私は出張先のアメリカにいた。<br>各編集部員の持ち回り企画…第2回担当の自分はどのようなテーマで作品を選ぼう……と考えていた折、同行していた川勝徳重さんから、クラシック界のとある偉大な作曲家についての話をされた。<br>ソ連出身のその作曲家が遺した作品の素晴らしさは一旦置いておくとして。<br>なんでもその息子は、当初はピアニスト、のちに指揮者としての活動も開始。世界各地を飛び回りながら、亡き父の楽曲を代表作から埋もれた作品まで幅広く取り上げ、その遺産を老齢に至る今日まで伝え続けているという。<br>ところが、かつて日本のとある雑誌が彼をカバーに起用した際、そこにはこんなコピーが添えられていたそうだ。<br>「親がえらいと子がこまる」<br>↓↓続きはこちらから↓↓<br>\[テーマによせて＆作品紹介\](https://to-ti.in/.../encounto-ti02_01)<br><br>━━━ 特集作品一覧 ━━━━<br>・ドリヤス工場『評判すぎる文学作品をだいたい10ページくらいの漫画で読む。』<br>\[「久米正雄『父の死』」\](https://to-ti.in/.../encounto-ti02_02)<br><br>・エルド吉水『龍子 RYUKO』<br>\[第1章「父娘」\](https://to-ti.in/.../encounto-ti02_03)・\[第2章「砂の雨」\](https://to-ti.in/.../encounto-ti02_04)<br><br>・ばったん\[『ある晩夏』\](https://to-ti.in/.../encounto-ti02_05)<br><br>・山本美希『かしこくて勇気ある子ども』<br>\[第1話\](https://to-ti.in/.../encounto-ti02_06)・\[第2話\](https://to-ti.in/.../encounto-ti02_07)<br><br>・大橋裕之『太郎は水になりたかった』<br>\[第17話「心」\](https://to-ti.in/.../encounto-ti02_08)<br><br>・今井新『ああ資本主義の悪の華はいつまで咲き誇るのか。』<br>\[第3話\](https://to-ti.in/.../encounto-ti02_09)<br>━━━━━━━━━━━━━━<br><br>【併読おすすめの他社作品】<br><br>・アレハンドロ・ホドロフスキー.../%E7%BF%BB%E8%A8%B3%E3%80%8E%E3%83%A1%E3%82%BF%E3%83%90%E3%83%AD%E3%83%B3%E3%81%AE%E4%B8%80%E6%97%8F%E3%80%8F%EF%BC%882012%E5%B9%B4%EF%BC%89<br><br>・山松ゆうきち『皆殺しのばあんか』（1973年）<br><br>・あすなひろし『ぼくのとうちゃん』（1978年）<br><br>・新藤兼人.../%E5%8A%87%E7%94%BB%E3%80%8E%E7%94%9F%E3%81%8D%E3%81%9F%E3%81%84%E3%80%8F%EF%BC%881999%E5%B9%B4%EF%BC%89 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | LINT | All 9 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=9 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://to-ti.in/.../Sougu_Emily.jpg` (image/jpeg, 442504 bytes, 920x1300) |  |  |  |
