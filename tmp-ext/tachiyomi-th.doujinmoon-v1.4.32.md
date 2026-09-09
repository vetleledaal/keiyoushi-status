# Extension Validation Report

- Extension: tachiyomi-th.doujinmoon-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1953904877869380978
- Source name: Doujin Moon
- Source language: th
- Selected manga input: latest offset 0: เเผนการให้ซาคามาตะอาบน้ำ (Darkmaya) (Sakamata Chloe) (`.../%E0%B9%80%E0%B9%80%E0%B8%9C%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%83%E0%B8%AB%E0%B9%89%E0%B8%8B%E0%B8%B2%E0%B8%84%E0%B8%B2%E0%B8%A1%E0%B8%B2%E0%B8%95%E0%B8%B0%E0%B8%AD%E0%B8%B2%E0%B8%9A%E0%B8%99`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | ผมเจอเพื่อนสมัยเรียนที่ร้านลามก [MM] How I Met my Old Classmate at an Adult Service Place (`.../%E0%B8%9C%E0%B8%A1%E0%B9%80%E0%B8%88%E0%B8%AD%E0%B9%80%E0%B8%9E%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%99%E0%B8%AA%E0%B8%A1%E0%B8%B1%E0%B8%A2%E0%B9%80%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B8%99%E0%B8%97%E0%B8%B5`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | เเผนการให้ซาคามาตะอาบน้ำ (Darkmaya) (Sakamata Chloe) (`.../%E0%B9%80%E0%B9%80%E0%B8%9C%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%83%E0%B8%AB%E0%B9%89%E0%B8%8B%E0%B8%B2%E0%B8%84%E0%B8%B2%E0%B8%A1%E0%B8%B2%E0%B8%95%E0%B8%B0%E0%B8%AD%E0%B8%B2%E0%B8%9A%E0%B8%99`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | ทะเลนี้กับเหล่าสาวสวยสุดเซ็กซี่ [A Gokuburi (Sian)] Odekake Shita no wa H na Gal Onee-chan-tachi to no Umi deshita (`.../%E0%B8%97%E0%B8%B0%E0%B9%80%E0%B8%A5%E0%B8%99%E0%B8%B5%E0%B9%89%E0%B8%81%E0%B8%B1%E0%B8%9A%E0%B9%80%E0%B8%AB%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B2%E0%B8%A7%E0%B8%AA%E0%B8%A7%E0%B8%A2%E0%B8%AA`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | เเผนการให้ซาคามาตะอาบน้ำ (Darkmaya) (Sakamata Chloe) (`.../%E0%B9%80%E0%B9%80%E0%B8%9C%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%83%E0%B8%AB%E0%B9%89%E0%B8%8B%E0%B8%B2%E0%B8%84%E0%B8%B2%E0%B8%A1%E0%B8%B2%E0%B8%95%E0%B8%B0%E0%B8%AD%E0%B8%B2%E0%B8%9A%E0%B8%99`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | เเผนการให้ซาคามาตะอาบน้ำ (Darkmaya) (Sakamata Chloe) (`.../%E0%B9%80%E0%B9%80%E0%B8%9C%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%83%E0%B8%AB%E0%B9%89%E0%B8%8B%E0%B8%B2%E0%B8%84%E0%B8%B2%E0%B8%A1%E0%B8%B2%E0%B8%95%E0%B8%B0%E0%B8%AD%E0%B8%B2%E0%B8%9A%E0%B8%99`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | ตอนที่ 1 (`.../%E0%B9%80%E0%B9%80%E0%B8%9C%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%83%E0%B8%AB%E0%B9%89%E0%B8%8B%E0%B8%B2%E0%B8%84%E0%B8%B2%E0%B8%A1%E0%B8%B2%E0%B8%95%E0%B8%B0%E0%B8%AD%E0%B8%B2%E0%B8%9A%E0%B8%99`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=เเผนการให้ซาคามาตะอาบน้ำ (Darkmaya) (Sakamata Chloe), URL=`.../%E0%B9%80%E0%B9%80%E0%B8%9C%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%83%E0%B8%AB%E0%B9%89%E0%B8%8B%E0%B8%B2%E0%B8%84%E0%B8%B2%E0%B8%A1%E0%B8%B2%E0%B8%95%E0%B8%B0%E0%B8%AD%E0%B8%B2%E0%B8%9A%E0%B8%99` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://doujinmoon.com/.../cover-34.webp` (image/webp (encoding: lossy), 33482 bytes, 700x979) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E0%B9%80%E0%B9%80%E0%B8%9C%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%83%E0%B8%AB%E0%B9%89%E0%B8%8B%E0%B8%B2%E0%B8%84%E0%B8%B2%E0%B8%A1%E0%B8%B2%E0%B8%95%E0%B8%B0%E0%B8%AD%E0%B8%B2%E0%B8%9A%E0%B8%99` |  |  |  |
| details thumbnail URL | PASS | `https://doujinmoon.com/.../cover-34.webp` |  |  |  |
| details author | PASS | anmonkan |  |  |  |
| details artist | PASS | Darkmaya |  |  |  |
| details genres | PASS | Adult ผู้ใหญ่, Ahegao หน้าฟิน, Big breast นมใหญ่, Blowjob, Doujin โดจิน, Drama ดราม่า, Matureผู้ใหญ่, Nakadashi ยสตน, มังงะ 18+, สาวผมสั้น, โดจินภาพสี, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.doujinmoon.com/.../1.jpg` (image/jpeg, 139764 bytes, 790x1105) |  |  |  |
