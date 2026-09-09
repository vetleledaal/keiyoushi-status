# Extension Validation Report

- Extension: tachiyomi-ja.ichicomi-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 2248461957459826404
- Source name: Ichicomi
- Source language: ja
- Selected manga input: popular offset 0: ダイナマックス (`.../12207421984204747468`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 773 | ダイナマックス (`.../12207421984204747468`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ダイナマックス (`.../12207421984204747468`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ダイナマックス (`.../12207421984204747468`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 1st Stage 『ミスターSHINOBIとその息子』 (`.../12207421984204747468`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 66 |  |  | <1s |

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
| popular listing | PASS | 773 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ダイナマックス, URL=`.../12207421984204747468` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 774/774 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 774/774 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.ichicomi.com%2Fpublic%2Fseries-sub-thumbnail-vertical-with-logo%2F12207421984204745334-684d1bdf6422f92852769eb57fc98ec0%3F1788768857` (image/jpeg, 99824 bytes, 484x684) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421984204747468` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.ichicomi.com%2Fpublic%2Fseries-thumbnail%2F12207421984204745334-1a501ddacad58092659fc64c9c8b2094%3F1788789557` (image/jpeg, 158724 bytes, 484x685) |  |  |  |
| details author | PASS | 根本純太 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | その日、人類は恐竜に支配された_立ち向かうのはミスターSHINOBIの１人息子、山口昇!!恐竜を登って!殴って!!食う!？講談社主催漫画賞「金賞」受賞の超新星が、”鋭利な牙、巨大な体を持つ恐竜”と”劇しく生きる人類”の戦いを描いた、壮絶バトルアクション開幕!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.ichicomi.com/.../12207421984205214441-80a7ba240b407a481ab6917b3949a054` (image/jpeg, 737333 bytes, 1125x1600) |  |  |  |
