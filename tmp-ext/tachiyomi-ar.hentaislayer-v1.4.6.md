# Extension Validation Report

- Extension: tachiyomi-ar.hentaislayer-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1383489648660567366
- Source name: هنتاي سلاير
- Source language: ar
- Selected manga input: popular offset 0: مذكرات منحرف (`.../%D9%85%D8%B0%D9%83%D8%B1%D8%A7%D8%AA-%D9%85%D9%86%D8%AD%D8%B1%D9%81`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | مذكرات منحرف (`.../%D9%85%D8%B0%D9%83%D8%B1%D8%A7%D8%AA-%D9%85%D9%86%D8%AD%D8%B1%D9%81`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | مديرتي التي تعشق الحفلات مثيرة جدًا... (`.../%D9%85%D8%AF%D9%8A%D8%B1%D8%AA%D9%8A-%D8%A7%D9%84%D8%AA%D9%8A-%D8%AA%D8%B9%D8%B4%D9%82-%D8%A7%D9%84%D8%AD%D9%81%D9%84%D8%A7%D8%AA-%D9%85%D8%AB%D9%8A%D8%B1%D8%A9-%D8%AC%D8%AF%D8%A7`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | كتاب مواساة هارويتشي الحميمية (`.../%D9%83%D8%AA%D8%A7%D8%A8-%D9%85%D9%88%D8%A7%D8%B3%D8%A7%D8%A9-%D9%87%D8%A7%D8%B1%D9%88%D9%8A%D8%AA%D8%B4%D9%8A-%D8%A7%D9%84%D8%AD%D9%85%D9%8A%D9%85%D9%8A%D8%A9`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | قرية اغتصاب الفتيان (`.../%D9%82%D8%B1%D9%8A%D8%A9-%D8%A7%D8%BA%D8%AA%D8%B5%D8%A7%D8%A8-%D8%A7%D9%84%D9%81%D8%AA%D9%8A%D8%A7%D9%86`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | مذكرات منحرف (`.../%D9%85%D8%B0%D9%83%D8%B1%D8%A7%D8%AA-%D9%85%D9%86%D8%AD%D8%B1%D9%81`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | مذكرات منحرف (`.../%D9%85%D8%B0%D9%83%D8%B1%D8%A7%D8%AA-%D9%85%D9%86%D8%AD%D8%B1%D9%81`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 17 | Chapter 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=مذكرات منحرف, URL=`.../%D9%85%D8%B0%D9%83%D8%B1%D8%A7%D8%AA-%D9%85%D9%86%D8%AD%D8%B1%D9%81` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaislayer.net/.../6a9214cccfb10.webp` (image/webp (encoding: lossy), 17902 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%D9%85%D8%B0%D9%83%D8%B1%D8%A7%D8%AA-%D9%85%D9%86%D8%AD%D8%B1%D9%81` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaislayer.net/.../6a9214cccfb10.webp` (image/webp (encoding: lossy), 43662 bytes, 500x700) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | مانهوا, مدرسي, اغتصاب, حريم, خيانة |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | تدور الأحداث في قطار الأنفاق المزدحم (الخط 1)، حيث تقاطع طريق فتاة تعرضت للتحرش مع طالب يدعى “مين جاي” (Min-jae)، وهو طالب متفوق يحصل على المركز الأول دراسياً لكنه يخفي جانبه المظلم كمتحرش في قطار الأنفاق. تتطرق القصة للتأثيرات النفسية والإثارة المظلمة في إطار من الدراما والإثارة.<br><br>Alternative Title: His Addictive Touch / Pervert Diary |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaislayer.net/.../6a92167687995_h0lO.webp` (image/webp (encoding: lossy), 809268 bytes, 720x14750) |  |  |  |
