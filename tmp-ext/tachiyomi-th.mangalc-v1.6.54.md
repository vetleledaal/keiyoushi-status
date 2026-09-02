# Extension Validation Report

- Extension: tachiyomi-th.mangalc-v1.6.54
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5607835948857138011
- Source name: Manga-Lc
- Source language: th
- Selected manga input: popular offset 0: Lookism (`.../43824`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Lookism (`.../43824`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Max Level Player (`.../52919`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Tyrant of the Otherworld Prison: My Shadow Can Evolve Infinitely (`.../322940`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Shepherd Wizard จอมเวทคนเลี้ยงแกะ (`.../406113`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lookism (`.../43824`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`.../43824`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 594 | 573 - อัพเดท (`.../573`) |  | <1s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lookism, URL=`43824` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-lc.net/.../Lookism-350x476.jpg` (image/jpeg, 96980 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `43824` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manga-lc.net/.../Lookism-193x278.jpg` (image/jpeg, 38131 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ : Lookism – พัคฮยองซอก ที่มีน้ำหนักเกินและไม่สวย ถูกรังแกและทารุณกรรมทุกวัน แต่ปาฏิหาริย์กำลังจะเกิดขึ้น ปาร์คฮยองซอก เด็กหนุ่มอ้วนเตี้ย ถูกบุลลี่รังแกเป็นประจำ วันหนึ่งเขาได้รับพรวิเศษ ทำให้เมื่อหลับแล้วเขาจะตื่นขึ้นมาในอีกร่างหนุ่มหล่อสมบูรณ์แบบ แต่ถ้าหลับแล้วตื่นอีกครั้งจะกลับร่างเดิม ทำให้เขาใช้ชีวิตกลางวันในรูปแบบหนุ่มหล่อและใช้ร่างเดิมทำงานพาร์ทไทม์ในตอนกลางคืน ใช้ชีวิตในสองรูปแบบที่แตกต่างกันคนละขั้ว กับสังคมที่ต่างกันไป!<br><br>อ่านเรื่องนี้ก่อนใครได้ที่ MANGA-LC.NET เท่านั้น! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 594 chapters |  |  |  |
| chapter dates | PASS | 594 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://manga-lc.net/.../Purple-Colorful-Cartoon-Illustrative-Anime-Presentation.jpg` (image/jpeg, 213067 bytes, 1920x1080) |  |  |  |
