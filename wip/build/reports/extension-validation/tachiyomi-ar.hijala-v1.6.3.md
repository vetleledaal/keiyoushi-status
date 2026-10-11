# Extension Validation Report

- Extension: tachiyomi-ar.hijala-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 917436262447415426
- Source name: Hijala
- Source language: ar
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Lookism (`.../lookism`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 5 | fight class 3 (`.../fight-class-3`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 5 | With a No-Cooldown Cheat, I Can Transform into an Undead Calamity! (`.../with-a-no-cooldown-cheat-i-can-transform-into-an-undead-calamity`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 5 | Kokuma Musou (`.../kokuma-musou`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Juvenile Law (`.../juvenile-law`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 632 | فصل 01 (`.../lookism-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| details description | PASS | بارك هيونج سوك، فتى سمين و غير جذاب، يتعرض للضرب و التحرش بشكل يومي، لكن هناك أعجوبة على وشك أن تحدث. لوكيزم هي كلمة جديدة للتمييز أو التحامل ضد الناس على أساس المظهر الجسدي ” التمييز ضد كل من الجميل و القبيح (فمثلاً “الموظف الجميل و الأنيق راتبه أعلى من الموظف الأقل حظاً بالجمال).<br><br>Alternative Names: <br>- 외모지상주의Oemojisangjuui |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 632 chapters |  |  |  |
| chapter dates | PASS | 632 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://hijala.com/.../01.webp` to `https://hijala.com/.../01.webp` (1 redirects) |  |  |  |
| page load | PASS | `http://hijala.com/.../01.webp` (image/webp (encoding: lossy), 935090 bytes, 688x15000) |  |  |  |
