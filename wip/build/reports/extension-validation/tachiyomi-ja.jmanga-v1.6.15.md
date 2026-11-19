# Extension Validation Report

- Extension: tachiyomi-ja.jmanga-v1.6.15
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangareader
- Source ID: 6141590427749684419
- Source name: Jmanga
- Source language: ja
- Selected manga input: popular offset 0: だぶるぷれい (`.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 35 | だぶるぷれい (`.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 35 | 氷の城壁 単行本版 (`.../%E6%B0%B7%E3%81%AE%E5%9F%8E%E5%A3%81-%E5%8D%98%E8%A1%8C%E6%9C%AC%E7%89%88-raw`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 35 | 放課後、僕らは宇宙に惑う (`.../%E6%94%BE%E8%AA%B2%E5%BE%8C%E3%80%81%E5%83%95%E3%82%89%E3%81%AF%E5%AE%87%E5%AE%99%E3%81%AB%E6%83%91%E3%81%86-raw`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 35 | スキンシップ・アート・レッスン (`.../%E3%82%B9%E3%82%AD%E3%83%B3%E3%82%B7%E3%83%83%E3%83%97%E3%83%BB%E3%82%A2%E3%83%BC%E3%83%88%E3%83%BB%E3%83%AC%E3%83%83%E3%82%B9%E3%83%B3-raw`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | だぶるぷれい (`.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | だぶるぷれい (`.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 46 | 第1話: 第1話 (`.../chapter-1-raw`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=だぶるぷれい, URL=`.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgoimg.view47.com/.../6a1cdf5c40e9e57c5a2e0d4e09c40c5b.jpeg` (image/jpeg, 31706 bytes, 300x426) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mgoimg.view47.com/.../6a1cdf5c40e9e57c5a2e0d4e09c40c5b.jpeg` was not downloaded |  |  |  |
| details author | PASS | ムラタコウジ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ラブストーリー, 広告掲載中 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | だぶるぷれい raw,だぶるぷれい zip,だぶるぷれい manga 高校二年生・広井玉緒は元野球部員。 蝉時雨の降り注ぐ、ある夏の日。 帰宅すると、誰もいない筈の自室から吐息が漏れていた。 ソフトボール部の4番でエース、学年イチの美少女である穂村蘭。 少女はベッドの上で玉緒の名を囁きながら、 その指は切なく蒼き衝動を求める。 瞬間。 汗と吐息が、夏に溶ける────。 一つ屋根の下、少年は憧れの少女と暮らし始め、 境界線は重なり、消えていく…… 真に隣の、二人遊戯（だぶるぷれい）が始まる。 大ヒットラブコメ『高嶺のハナさん』の著者が紡ぐ、 “主従の青春”ラブストーリー。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | LINT | All 46 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=46 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://jmanga.cloud/.../filter <redacted query values: sort and p>` to `https://jmanga.party/.../filter <redacted query values: sort and p>` (1 redirects); popular: `https://jmanga.cloud/.../filter <redacted query values: sort and p>` to `https://jmanga.party/.../filter <redacted query values: sort and p>` (1 redirects); popular: `https://jmanga.cloud/.../filter <redacted query values: sort and p>` to `https://jmanga.party/.../filter <redacted query values: sort and p>` (1 redirects); popular: `https://jmanga.cloud/.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw` to `https://jmanga.party/.../%E3%81%A0%E3%81%B6%E3%82%8B%E3%81%B7%E3%82%8C%E3%81%84-raw` (1 redirects); popular: `https://jmanga.cloud <redacted query values: q and p>` to `https://jmanga.party <redacted query values: q and p>` (1 redirects); popular: `https://jmanga.cloud/.../chapter <redacted query values: mode and id>` to `https://jmanga.party/.../chapter <redacted query values: mode and id>` (1 redirects); popular: `https://jmanga.cloud/.../filter <redacted query values: sort and p>` to `https://jmanga.party/.../filter <redacted query values: sort and p>` (1 redirects) |  |  |  |
| page load | PASS | `https://sv1.freeimgmg.online/.../1.jpg` (image/jpeg, 321227 bytes, 1530x2160) |  |  |  |
