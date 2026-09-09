# Extension Validation Report

- Extension: tachiyomi-ar.hentaislayer-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fuzzydoodle
- Source ID: 1383489648660567366
- Source name: هنتاي سلاير
- Source language: ar
- Selected manga input: popular offset 0: النونا وشقيقها الصغير الضخم (`.../%D8%A7%D9%84%D9%86%D9%88%D9%86%D8%A7-%D9%88%D8%B4%D9%82%D9%8A%D9%82%D9%87%D8%A7-%D8%A7%D9%84%D8%B5%D8%BA%D9%8A%D8%B1-%D8%A7%D9%84%D8%B6%D8%AE%D9%85`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | النونا وشقيقها الصغير الضخم (`.../%D8%A7%D9%84%D9%86%D9%88%D9%86%D8%A7-%D9%88%D8%B4%D9%82%D9%8A%D9%82%D9%87%D8%A7-%D8%A7%D9%84%D8%B5%D8%BA%D9%8A%D8%B1-%D8%A7%D9%84%D8%B6%D8%AE%D9%85`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | الوحوش الذين يتجاوزون الحدود (`.../%D8%A7%D9%84%D9%88%D8%AD%D9%88%D8%B4-%D8%A7%D9%84%D8%B0%D9%8A%D9%86-%D9%8A%D8%AA%D8%AC%D8%A7%D9%88%D8%B2%D9%88%D9%86-%D8%A7%D9%84%D8%AD%D8%AF%D9%88%D8%AF`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | ولاء فتاتي المثيرة (`.../%D9%88%D9%84%D8%A7%D8%A1-%D9%81%D8%AA%D8%A7%D8%AA%D9%8A-%D8%A7%D9%84%D9%85%D8%AB%D9%8A%D8%B1%D8%A9`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | الرئيسة المنحرفة (`.../%D8%A7%D9%84%D8%B1%D8%A6%D9%8A%D8%B3%D8%A9-%D8%A7%D9%84%D9%85%D9%86%D8%AD%D8%B1%D9%81%D8%A9`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | النونا وشقيقها الصغير الضخم (`.../%D8%A7%D9%84%D9%86%D9%88%D9%86%D8%A7-%D9%88%D8%B4%D9%82%D9%8A%D9%82%D9%87%D8%A7-%D8%A7%D9%84%D8%B5%D8%BA%D9%8A%D8%B1-%D8%A7%D9%84%D8%B6%D8%AE%D9%85`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | النونا وشقيقها الصغير الضخم (`.../%D8%A7%D9%84%D9%86%D9%88%D9%86%D8%A7-%D9%88%D8%B4%D9%82%D9%8A%D9%82%D9%87%D8%A7-%D8%A7%D9%84%D8%B5%D8%BA%D9%8A%D8%B1-%D8%A7%D9%84%D8%B6%D8%AE%D9%85`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | Chapter 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=النونا وشقيقها الصغير الضخم, URL=`.../%D8%A7%D9%84%D9%86%D9%88%D9%86%D8%A7-%D9%88%D8%B4%D9%82%D9%8A%D9%82%D9%87%D8%A7-%D8%A7%D9%84%D8%B5%D8%BA%D9%8A%D8%B1-%D8%A7%D9%84%D8%B6%D8%AE%D9%85` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaislayer.net/.../6a9f50927c830.webp` (image/webp (encoding: lossy), 15400 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%D8%A7%D9%84%D9%86%D9%88%D9%86%D8%A7-%D9%88%D8%B4%D9%82%D9%8A%D9%82%D9%87%D8%A7-%D8%A7%D9%84%D8%B5%D8%BA%D9%8A%D8%B1-%D8%A7%D9%84%D8%B6%D8%AE%D9%85` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaislayer.net/.../6a9f50927c830.webp` (image/webp (encoding: lossy), 35096 bytes, 500x700) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | مانهوا, اغتصاب, محارم |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | سايبيول، موظفة المكتب المحبوبة من قِبل زملائها بسبب مظهرها الصغير واللطيف! أنا قلق عليها قليلاً لأنها تبدو متعبة جداً مؤخراً… “سايبيول، تبدين مرهقة هذه الأيام.” “أجل، لأنني كنتُ ألعب مع أخي الأصغر.” “حقاً؟ هل لديكِ أخ أصغر؟” “نعم، إنه لطيف.” “واو~ إنه حقاً…” هه؟!! أخوها الأصغر في الصورة هو رجل أسود ضخم؟! وهذا الجسد البشع هو بالتأكيد…<br><br>Alternative Title: Noona and her BIG little Bro |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaislayer.net/.../6a9f50b0a59ba_B5Ty.webp` (image/webp (encoding: lossy), 614546 bytes, 720x14111) |  |  |  |
