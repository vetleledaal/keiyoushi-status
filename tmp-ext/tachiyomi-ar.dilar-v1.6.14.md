# Extension Validation Report

- Extension: tachiyomi-ar.dilar-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7634600808243438399
- Source name: Dilar
- Source language: ar
- Selected manga input: latest offset 0: I Was Told to Die (`.../I%20Was%20Told%20to%20Die`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | I Failed to Abandon the Villain (`.../I%20Failed%20to%20Abandon%20the%20Villain`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | I Was Told to Die (`.../I%20Was%20Told%20to%20Die`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 22 | The Vampire Lord's Greatest Wife (`.../The%20Vampire%20Lord's%20Greatest%20Wife`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Was Told to Die (`.../I%20Was%20Told%20to%20Die`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Was Told to Die (`.../I%20Was%20Told%20to%20Die`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Unsupported encryption protocol version: 12 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Unsupported encryption protocol version: 12 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Was Told to Die, URL=`8581/I Was Told to Die` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dilar.tube/.../large_529da27f-4a9f-4957-975a-ee9b0b35b1a1.webp` (image/webp (encoding: lossy), 163196 bytes, 450x644) |  |  |  |
| details identity | PASS | Details preserved selected URL `8581/I Was Told to Die` |  |  |  |
| details thumbnail URL | PASS | `https://dilar.tube/.../large_529da27f-4a9f-4957-975a-ee9b0b35b1a1.webp` |  |  |  |
| details author | PASS | Baggwili |  |  |  |
| details artist | PASS | Ant Studio |  |  |  |
| details genres | PASS | سحر, رومانسي, دراما, شوجو, مانهوا, فانتازيا, تاريخي, عائلي |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | من الزملاء الذين كنت معهم لمدة 10 سنوات. "أنا آسفة، رين. موتي من أجل العالم بدلاً من ذلك." هكذا تمامًا، عندما بدا الأمر وكأنه انتهى. "... هاه؟" فتحت رين عينيها مرة أخرى. "أنت فتاة غبية وحتى جاحدة! يبدو من الواضح أنني سأستخدم من قبل رجل آخر، لا يعرف النعمة التي جلبتني إلى قلعتي!" بعد 30 عامًا، أصبحت طفلة غير شرعية لعائلة توسلينا العظيمة،  * "أنت أفضل موهبة. سيكون من العار تركك تتعفنين هنا. ألن تأتي معي؟" نظرت رين إلى الرجل الذي مد يدها إليها. إنها واحدة من الأبطال الأربعة الذين يشيد بهم العالم. رجل خان زميلتها السابقة رين، يريد تبنيها لأنها تشبه مهاراته في السيف الميت الآن. هل أنت مجنونة؟ هل هذا متجر تبني لك؟ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Unsupported encryption protocol version: 12 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
