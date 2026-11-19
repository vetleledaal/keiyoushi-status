# Extension Validation Report

- Extension: tachiyomi-ar.mangaorigin-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4359631801518093704
- Source name: Manga Origin
- Source language: ar
- Selected manga input: popular offset 0: Mizutamari Ni Ukabu Shima (`.../mizutamari-ni-ukabu-shima.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Mizutamari Ni Ukabu Shima (`.../mizutamari-ni-ukabu-shima.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Requiem of the Shogun (`.../requiem-of-shogun.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mizutamari Ni Ukabu Shima (`.../mizutamari-ni-ukabu-shima.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mizutamari Ni Ukabu Shima (`.../mizutamari-ni-ukabu-shima.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Mizutamari Ni Ukabu Shima - 1 (`.../mizutamari-ni-ukabu-shima-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 47 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mizutamari Ni Ukabu Shima, URL=`.../mizutamari-ni-ukabu-shima.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../AVvXsEjt-sogt1qvedrPXE62zsxwzNh6pDufkUbkZJt4aKAYt7ihorAZD_snLxKwe0rIRJPis34wf3SwcvQRlTjC7TSbnsyVgzsEnqYCjykF2B2jPoW3wR-qdYBetacoBhrldFxQZHKnd6YFl33rDzSwu5ZOZ5d7goFi8DsuFdLZdAdAZCSFTQeODJPnnK6gXw=s0` (image/jpeg, 176587 bytes, 1000x1430) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mizutamari-ni-ukabu-shima.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../AVvXsEjt-sogt1qvedrPXE62zsxwzNh6pDufkUbkZJt4aKAYt7ihorAZD_snLxKwe0rIRJPis34wf3SwcvQRlTjC7TSbnsyVgzsEnqYCjykF2B2jPoW3wR-qdYBetacoBhrldFxQZHKnd6YFl33rDzSwu5ZOZ5d7goFi8DsuFdLZdAdAZCSFTQeODJPnnK6gXw=s0` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | تراجيدي, دراما, سينين, نفسي |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | إننا نكافح للعيش لأننا نملك الأمل. نبذل قُصارى جهدنا لنكون سعداء لأننا هناك شخصًا يجب علينا حمايته. إننا نؤمن بالغد ونتقدم نحو الأمام لأن هناك شخصًا على مسافة بعيدة عنّا. أخٌ أكبر وأختٌ صغرى يقضيان أيامهما في انتظار والدتهما الحبيبة. فجأةً؛ يحلُّ على الأخ الأكبر -الذي يفكر بأخته الصغرى- قدرٌ مُحَقق. وسط انهمار المطر؛ تبدأ هذه "القصة".<br><br>**Alternative Names:**<br>- الجزيرة العائمة فوق بركة المياه |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../AVvXsEjzEccSYCmXyWIkXSHOSHjhrM9M756OpTy_ZYEuOFtz65AAkZGJAUx5C7JKU_tgzGmGEs8fHkhquiUsChP81YlXf604LPhoUd7uaTzy-Q6fq_FsMWMO3M3Liwinp9mr7VleCDjsPcyEBM2-CgeFs9SuzUp6XyqrCkl7xhF5v_WbhLf8gXVMuzATrT6F=s0` (image/jpeg, 176587 bytes, 1000x1430) |  |  |  |
