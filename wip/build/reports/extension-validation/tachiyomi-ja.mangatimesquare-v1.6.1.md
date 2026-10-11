# Extension Validation Report

- Extension: tachiyomi-ja.mangatimesquare-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 5972758064357912813
- Source name: Manga Time Square
- Source language: ja
- Selected manga input: popular offset 0: ニセアイホンアイ (`.../12207421984001570933`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | ニセアイホンアイ (`.../12207421984001570933`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | ローカル女子の遠吠え (`.../12207421983530024760`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ニセアイホンアイ (`.../12207421984001570933`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ニセアイホンアイ (`.../12207421984001570933`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 第1話 (`.../12207421984001577937`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ニセアイホンアイ, URL=`12207421984001570933` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.mangatime-square.com/.../12207421984001570933-db467c3fd77d0c8254b222ed12c61aac <redacted query values: 1788490717>` (image/jpeg, 240975 bytes, 700x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984001570933` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.mangatime-square.com/.../12207421984001570933-db467c3fd77d0c8254b222ed12c61aac <redacted query values: 1788490717>` |  |  |  |
| details author | PASS | いくたはな |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 女子大生・新は男に絡まれた女性を助けるがその時に彼女の服を汚してしまう。彼女は人気女優・灰野恋でその服は１千万円もし、弁償として、モデルNeOとして自分の恋人を演じるよう命じる。最初はお金と仕事の関係だったが、二人の距離は徐々に縮まり…ドラマチック百合4コマ！【毎月第四金曜日更新！】 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.mangatime-square.com/.../12207421984004804737-224d2e0be6c31f22e8744612fbf58685` (image/jpeg, 719409 bytes, 1354x1920) |  |  |  |
