# Extension Validation Report

- Extension: tachiyomi-ar.manhatok-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 20
- Lint: 1
- Warnings: 1
- Skipped: 13
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 743599002989616408
- Source name: Manhatok
- Source language: ar
- Selected manga input: popular offset 0: Boruto (`.../boruto-naruto-next-generations.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Boruto (`.../boruto-naruto-next-generations.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Blue Lock (`.../blue-lock.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Boruto (`.../boruto-naruto-next-generations.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boruto (`.../boruto-naruto-next-generations.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Boruto, URL=`.../boruto-naruto-next-generations.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../001%20%284%29.webp` (image/jpeg, 18329 bytes, 127x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../boruto-naruto-next-generations.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../001%20%284%29.webp` (image/jpeg, 117069 bytes, 450x708) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | تكملة لسلسلة مانغا ناروتو، تتمحور حول بوروتو أوزوماكي، ابن الهوكاجي السابع ناروتو أوزوماكي، الذي يباشر تدريبه على يد ساسكي أوتشيها ويبدأ مغامراته الخاصة مع أصدقائه. تشهد قرية الورق (كونوها) على عصر من السلام والحداثة، مباني شاهقة وشاشات كبيرة وقطار سريع يتحرك باستمرار في أرجاء القرية ليربط ما بين الأحياء. على الرغم من التحديثات مازالت قرية كونوها قرية للشينوبي وأعداد سكانها في ارتفاع. بوروتو أوزوماكي هو أبن الهوكاغي السابع ناروتو أوزوماكي وقد سجل في أكاديمية النينجا لتعلم أساليب النينجا. وزملائه على استعداد لتجاهله كونه أبن الهوكاغي السابع. ولكن بقوة الهواء يقوم بوروتو باثبات أن معتقداتهم عنه خاطئة. تبدأ سلسلة من الأحداث الغامضة وعلى بوروتو وأصدقائه تولي أمرها. حكاية بوروتو على وشك أن تبدأ ؟ ترى هل ستكون مغامراته أفضل من التي عاشها والده؟<br><br>أسماء أخرى: BORUTO-ボルト- -NARUTO NEXT GENERATIONS-بوروتو: ناروتو الجيل القادم |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
