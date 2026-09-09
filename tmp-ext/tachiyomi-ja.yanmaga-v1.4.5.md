# Extension Validation Report

- Extension: tachiyomi-ja.yanmaga-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2126618372106431410
- Source name: ヤンマガ（マンガ）
- Source language: ja
- Selected manga input: latest offset 0: 彼女の友達 (`.../%E5%BD%BC%E5%A5%B3%E3%81%AE%E5%8F%8B%E9%81%94`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 上野くんは開発済み (`.../%E4%B8%8A%E9%87%8E%E3%81%8F%E3%82%93%E3%81%AF%E9%96%8B%E7%99%BA%E6%B8%88%E3%81%BF`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 108P!~1年後に絶対108Pする話~ (`.../108P1%E5%B9%B4%E5%BE%8C%E3%81%AB%E7%B5%B6%E5%AF%BE108P%E3%81%99%E3%82%8B%E8%A9%B1`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 彼女の友達 (`.../%E5%BD%BC%E5%A5%B3%E3%81%AE%E5%8F%8B%E9%81%94`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 運命など存在しないので (`.../%E9%81%8B%E5%91%BD%E3%81%AA%E3%81%A9%E5%AD%98%E5%9C%A8%E3%81%97%E3%81%AA%E3%81%84%E3%81%AE%E3%81%A7`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 彼女の友達 (`.../%E5%BD%BC%E5%A5%B3%E3%81%AE%E5%8F%8B%E9%81%94`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 148 | episode.131 (`.../518fa37a2633929a69931e6829726e3d`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Could not find chapter ID | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Could not find chapter ID | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://eh96lnrmau.user-space.cdn.idcfcloud.net/.../1312.jpg <redacted query values: auto and width>` (image/jpeg, 18561 bytes, 400x210) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E5%BD%BC%E5%A5%B3%E3%81%AE%E5%8F%8B%E9%81%94` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://eh96lnrmau.user-space.cdn.idcfcloud.net/.../1312.jpg <redacted query values: auto and width>` (image/jpeg, 49536 bytes, 750x394) |  |  |  |
| details author | PASS | じゅら |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | #学園, #エロ, #恋愛, #お色気, #ラブストーリー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 人生で初めてできた、かわいい彼女。でもその友達は、彼女よりも豊満なカラダで僕を誘惑してきて…。彼女の友達にこんな風に迫られたら、あなたはどうしますか？ 大人気同人サークル「JACK-POT」のじゅらが描く、魅惑の背徳物語。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 148 chapters |  |  |  |
| chapter dates | PASS | 148 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Could not find chapter ID |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
