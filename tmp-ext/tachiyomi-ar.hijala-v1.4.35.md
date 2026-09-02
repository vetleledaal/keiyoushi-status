# Extension Validation Report

- Extension: tachiyomi-ar.hijala-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 917436262447415426
- Source name: Hijala
- Source language: ar
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | Lookism (`.../lookism`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 5 | Quest Supremacy (`.../quest-supremacy`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 5 | Contract Killer Enrollment (`.../contract-killer-enrollment`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 5 | Stone Age (`.../stone-age`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Juvenile Law (`.../juvenile-law`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 626 | فصل 01 (`.../lookism-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Lookism, URL=`.../lookism` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hijala.com/.../%D9%84%D9%88%D9%83%D8%B3%D9%8A%D9%85-1-225x300.gif` (image/gif (format: 89a), 50826 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lookism` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hijala.com/.../%D9%84%D9%88%D9%83%D8%B3%D9%8A%D9%85-1.gif` (image/gif (format: 89a), 7557745 bytes, 448x598) |  |  |  |
| details author | PASS | Taejun Pak |  |  |  |
| details artist | PASS | Taejun Pak |  |  |  |
| details genres | PASS | أكشن, حياة مدرسية, رياضة, شريحة من الحياة, فنون قتالية, قوى خارقة, مغامرات, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بارك هيونج سوك، فتى سمين و غير جذاب، يتعرض للضرب و التحرش بشكل يومي، لكن هناك أعجوبة على وشك أن تحدث. لوكيزم هي كلمة جديدة للتمييز أو التحامل ضد الناس على أساس المظهر الجسدي ” التمييز ضد كل من الجميل و القبيح (فمثلاً “الموظف الجميل و الأنيق راتبه أعلى من الموظف الأقل حظاً بالجمال).<br><br>Alternative Names: 외모지상주의Oemojisangjuui |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 626 chapters |  |  |  |
| chapter dates | PASS | 626 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://hijala.com/.../01.webp` (image/webp (encoding: lossy), 935090 bytes, 688x15000) |  |  |  |
