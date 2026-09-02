# Extension Validation Report

- Extension: tachiyomi-ja.jmanga-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6141590427749684419
- Source name: Jmanga
- Source language: ja
- Selected manga input: latest offset 0: せっかく農家に転生したので勇者は目指しません (`.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | だぶるぷれい (`.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 35 | だぶるぷれい (`.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 35 | せっかく農家に転生したので勇者は目指しません (`.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 35 | せっかく農家に転生したので勇者は目指しません (`.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | せっかく農家に転生したので勇者は目指しません (`.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | せっかく農家に転生したので勇者は目指しません (`.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 25 | 第1話: 第1話 (`.../chapter-1-raw`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 58 |  |  | 1-10s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=せっかく農家に転生したので勇者は目指しません, URL=`.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgoimg.view47.com/.../8adc64ef44d7a8aef751138c50dba870.jpeg` (image/jpeg, 19377 bytes, 220x312) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mgoimg.view47.com/.../8adc64ef44d7a8aef751138c50dba870.jpeg` (image/jpeg, 32263 bytes, 300x426) |  |  |  |
| details author | PASS | ゆーにっと, 月見里嘉助 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 電子特典付き |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | せっかく農家に転生したので勇者は目指しません raw,せっかく農家に転生したので勇者は目指しません zip,せっかく農家に転生したので勇者は目指しません manga 【幼い頃からコツコツ剣術と魔法を学んでいたら規格外の村人に!?】 残業漬けのサラリーマンから、小さな村の農家の子供に転生したルーカス。 今度の人生こそは早死にせず、勇者なんて絶対目指さず、のどかに畑を耕して生きていく――はずだった。 野菜を作るのに必要だと言われ、剣術や魔法を練習していたら、 元剣聖のお爺さんから剣の才能を見込まれ、六つの属性の精霊たちにまで気に入られて剣術も魔法も覚醒してしまい――？ 「勇者？ いや、俺はただの農家として静かに暮らしたいんですけど…」 家族と畑を守るために身につけた力が村どころか世界を救ってしまう!? のんびり生きたいルーカスは、「普通の農家」としてスローライフを貫けるのか。 のどかな村(?)で無自覚に強くなっていく、異世界転生ファンタジー開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | LINT | All 25 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=25 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://sv1.freeimgmg.online/.../1.webp` (image/webp (container: extended), 172456 bytes, 844x1200) |  |  |  |
