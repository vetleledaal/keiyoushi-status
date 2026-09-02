# Extension Validation Report

- Extension: tachiyomi-th.mangakimi-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 358347131669055728
- Source name: MangaKimi
- Source language: th
- Selected manga input: popular offset 0: I Became the Male Lead’s Adopted Daughter ฉันกลายเป็นลูกสาวบุญธรรมของท่านดยุก (`.../i-became-the-male-leads-adopted-daughter`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | I Became the Male Lead’s Adopted Daughter ฉันกลายเป็นลูกสาวบุญธรรมของท่านดยุก (`.../i-became-the-male-leads-adopted-daughter`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Not-Sew-Wicked Stepmom ฉันเป็นแม่เลี้ยงนะ แต่ลูกสาวน่ารักเกินไปแล้ว (`.../not-sew-wicked-stepmom`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | The Tutorial is Too Hard (`.../the-tutorial-is-too-hard`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | The Forgotten Field ทุ่งหญ้าที่ลืมเลือน (`.../the-forgotten-field`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I Became the Male Lead’s Adopted Daughter ฉันกลายเป็นลูกสาวบุญธรรมของท่านดยุก (`.../i-became-the-male-leads-adopted-daughter`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Became the Male Lead’s Adopted Daughter ฉันกลายเป็นลูกสาวบุญธรรมของท่านดยุก (`.../i-became-the-male-leads-adopted-daughter`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 151 | ตอนที่ 1 (`.../i-became-the-male-leads-adopted-daughter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 81 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Became the Male Lead’s Adopted Daughter ฉันกลายเป็นลูกสาวบุญธรรมของท่านดยุก, URL=`.../i-became-the-male-leads-adopted-daughter` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.mangakimi.com/.../I-Became-the-Male-Leads-Adopted-Daughter.jpg` (image/jpeg, 79962 bytes, 400x573) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-became-the-male-leads-adopted-daughter` |  |  |  |
| details thumbnail URL | PASS | `https://www.mangakimi.com/.../I-Became-the-Male-Leads-Adopted-Daughter.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Fantasy, Manhwa, Romance, Shoujo, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อ่าน I Became the Male Lead’s Adopted Daughter อ่าน ฉันกลายเป็นลูกสาวบุญธรรมของท่านดยุก |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 151 chapters |  |  |  |
| chapter dates | PASS | 151 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 81 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.mangakimi.com/.../MV5J4OL26T-1676349022.jpg` (image/jpeg, 150272 bytes, 1000x1250) |  |  |  |
