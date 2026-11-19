# Extension Validation Report

- Extension: tachiyomi-ar.despairmanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 886527590434722171
- Source name: Despair Manga
- Source language: ar
- Selected manga input: popular offset 0: الزهرة العطرة تتفتح بكرامة (`.../kaoru-hana-wa-rin-to-saku`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | الزهرة العطرة تتفتح بكرامة (`.../kaoru-hana-wa-rin-to-saku`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | لعبة الكاذب (`.../liar-game`) |  | <1s |
| latest | `getLatestUpdates(1)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 1393: Expected string literal but 'null' literal was found at path: \$\[2\].slug<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....d42dbbdce1423fdf18a0a","slug":null,"title_ar":"بارتليت ، جني..... | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | الزهرة العطرة تتفتح بكرامة (`.../kaoru-hana-wa-rin-to-saku`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | الزهرة العطرة تتفتح بكرامة (`.../kaoru-hana-wa-rin-to-saku`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 217 | kaoru-hana-wa-rin-to-saku - الفصل 1.1 (`.../1.1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 1393: Expected string literal but 'null' literal was found at path: \$\[2\].slug<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....d42dbbdce1423fdf18a0a","slug":null,"title_ar":"بارتليت ، جني..... | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | Unexpected JSON token at offset 1393: Expected string literal but 'null' literal was found at path: \$\[2\].slug<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....d42dbbdce1423fdf18a0a","slug":null,"title_ar":"بارتليت ، جني..... |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=الزهرة العطرة تتفتح بكرامة, URL=`kaoru-hana-wa-rin-to-saku` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Unexpected JSON token at offset 1393: Expected string literal but 'null' literal was found at path: \$\[2\].slug<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....d42dbbdce1423fdf18a0a","slug":null,"title_ar":"بارتليت ، جني..... |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://test.despair-world.com/.../cover.png` (image/png, 1462013 bytes, 847x1264) |  |  |  |
| details identity | PASS | Details preserved selected URL `kaoru-hana-wa-rin-to-saku` |  |  |  |
| details thumbnail URL | PASS | `https://test.despair-world.com/.../cover.png` |  |  |  |
| details author | PASS | Mikami Saka |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | دراما, شونين, رومانسي, كوميديا, مدرسي, شريحة من الحياة |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | في مكان معين توجد مدرستان ثانويتان متجاورتان. مدرسة تشيدوري الثانوية ، مدرسة ذكور حيث يتجمع الحمقى ، ومدرسة كيكيو للبنات ، وهي مدرسة راسخة للفتيات. يلتقي رينتارو تسوموجي ، طالب السنة الثانية القوي والهادئ في مدرسة تشيدوري الثانوية ، بكاوروكو واكوري ، الفتاة التي تأتي كعميل أثناء مساعدته في متجر كعك عائلته. يشعر رينتارو بالراحة في قضاء الوقت مع كاوروكو ، لكنها طالبة في مدرسة كيكيو ، وهي مدرسة مجاورة تكره تمامًا مدرسة تشيدوري. هذه قصة شخصين قريبين جدًا ولكنهما بعيدان جدًا.<br><br>أسماء أخرى:<br>kaoru hana wa rin to saku |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 217 chapters |  |  |  |
| chapter dates | PASS | 217 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://test.despair-world.com/.../001.webp` (image/webp (encoding: lossy), 130056 bytes, 1840x1378) |  |  |  |
