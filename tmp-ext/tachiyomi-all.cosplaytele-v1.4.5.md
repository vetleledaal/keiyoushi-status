# Extension Validation Report

- Extension: tachiyomi-all.cosplaytele-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7395748658970167454
- Source name: CosplayTele
- Source language: all
- Selected manga input: popular offset 0: Mizu cosplay Cantarella &#8211; Wuthering Waves &#8220;86 photos and 4 videos&#8221; (`.../cantarella`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Mizu cosplay Cantarella &#8211; Wuthering Waves &#8220;86 photos and 4 videos&#8221; (`.../cantarella`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | 水淼Aqua cosplay Marin Kitagawa New Outfit &#8211; Sono Bisque Doll &#8220;81 photos&#8221; (`.../marin-kitagawa-new-outfit`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 咬一口兔娘ovo (Yaokoututu) cosplay Tsunade – Naruto “89 photos and 1 video” (`.../tsunade-4`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 小瑶幺幺 (xiaoyaoyaoyao12) cosplay Fu Xuan – Honkai:Star Rail “58 photos and 4 videos” (`.../fu-xuan-4`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mizu cosplay Cantarella – Wuthering Waves “86 photos and 4 videos” (`.../cantarella`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../cantarella`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 86 |  |  | <1s |

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
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cosplaytele.com/.../Mizu-cosplay-Cantarella-Wuthering-Waves-87_result.webp` (image/webp (encoding: lossy), 116308 bytes, 2385x1600) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Mizu cosplay Cantarella &#8211; Wuthering Waves &#8220;86 photos and 4 videos&#8221; to Mizu cosplay Cantarella – Wuthering Waves “86 photos and 4 videos” |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Mizu, Cantarella, Wuthering Waves, Cosplay Ero, Cosplay Game, Mizu, Video Cosplay, Cantarella, Wuthering Waves |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Mizu cosplay Cantarella – Wuthering Waves “86 photos and 4 videos” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 86 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cosplaytele.com/.../Mizu-cosplay-Cantarella-Wuthering-Waves-1_result.webp` (image/webp (encoding: lossy), 195166 bytes, 1833x1200) |  |  |  |
