# Extension Validation Report

- Extension: tachiyomi-ja.comicgardo-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 27
- Lint: 2
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 3118962894631295374
- Source name: Comic Gardo
- Source language: ja
- Selected manga input: popular offset 0: 優等生がアダルトグッズを買いに来た (`.../12207421984094260440`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 135 | 優等生がアダルトグッズを買いに来た (`.../12207421984094260440`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 優等生がアダルトグッズを買いに来た (`.../12207421984094260425`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 優等生がアダルトグッズを買いに来た (`.../12207421984094260440`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | 第1話「学校と親には内緒にしてください……」 (`.../12207421984094260425`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 38 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 135 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=優等生がアダルトグッズを買いに来た, URL=`.../12207421984094260425` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 136/136 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 136/136 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-gardo.com%2Fpublic%2Fseries-thumbnail%2F12207421983996994170-1d1f64004059f144c0c1ad357ae1230a%3F1786684627` (image/jpeg, 53657 bytes, 500x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421984094260440` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-gardo.com%2Fpublic%2Fseries-thumbnail%2F12207421983996994170-1d1f64004059f144c0c1ad357ae1230a%3F1786684627` (image/jpeg, 78615 bytes, 484x484) |  |  |  |
| details author | PASS | コナタエル.../%E5%8D%83%E7%A8%AE%E3%81%BF%E3%81%AE%E3%82%8A |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | アダルトグッズも取り扱う中古書店でバイトをしていた女子高生・水城綾はある日、同じクラスの優等生・茅野有季とアダルトコーナーで遭遇。学校で一目置かれている有季は、なんと"ストレス解消"のためのグッズを吟味していたのだ。小さな秘密を共有する二人の関係は次第に深まっていき――。思いがけない出会いから始まる女子高生のガールミーツガール。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-gardo.com/.../12207421984094931997-815158e61148bf0fa038390ef4993cde` (image/jpeg, 384475 bytes, 1125x1600) |  |  |  |
