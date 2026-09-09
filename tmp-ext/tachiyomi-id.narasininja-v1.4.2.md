# Extension Validation Report

- Extension: tachiyomi-id.narasininja-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 0
- Warnings: 3
- Skipped: 2
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4748581925941451102
- Source name: NarasiNinja
- Source language: id
- Selected manga input: popular offset 0: Maryoku Zero no Saikyou Majutsushi: Yahari Omaera no Majutsu Riron wa Machigatte Iru Nda ga (`.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | Maryoku Zero no Saikyou Majutsushi: Yahari Omaera no Majutsu Riron wa Machigatte Iru Nda ga (`.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Maryoku Zero no Saikyou Majutsushi: Yahari Omaera no Majutsu Riron wa Machigatte Iru Nda ga (`.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | I Became an Evolving Space Monster (`.../i-became-an-evolving-space-monster`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Maryoku Zero no Saikyou Majutsushi: Yahari Omaera no Majutsu Riron wa Machigatte Iru Nda ga (`.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Maryoku Zero no Saikyou Majutsushi: Yahari Omaera no Majutsu Riron wa Machigatte Iru Nda ga (`.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 30 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 172 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Maryoku Zero no Saikyou Majutsushi: Yahari Omaera no Majutsu Riron wa Machigatte Iru Nda ga, URL=`.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 10 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | FAIL | Invalid manga: popular entry 3: title=<blank>, URL=`.../chapter-27`, popular entry 4: title=<blank>, URL=`.../chapter-26`, popular entry 5: title=<blank>, URL=`.../chapter-25`, popular entry 8: title=<blank>, URL=`.../chapter-55`, popular entry 9: title=<blank>, URL=`.../chapter-54`, popular entry 10: title=<blank>, URL=`.../chapter-49`, popular entry 13: title=<blank>, URL=`.../chapter-63`, popular entry 14: title=<blank>, URL=`.../chapter-62`, popular entry 15: title=<blank>, URL=`.../chapter-61`, popular entry 18: title=<blank>, URL=`.../chapter-17`, popular entry 19: title=<blank>, URL=`.../chapter-16`, popular entry 20: title=<blank>, URL=`.../chapter-10`, popular entry 23: title=<blank>, URL=`.../chapter-87`, popular entry 24: title=<blank>, URL=`.../chapter-86`, popular entry 25: title=<blank>, URL=`.../chapter-84`, popular entry 28: title=<blank>, URL=`.../chapter-91`, popular entry 29: title=<blank>, URL=`.../chapter-90`, popular entry 30: title=<blank>, URL=`.../chapter-88`, popular entry 33: title=<blank>, URL=`.../chapter-92`, popular entry 34: title=<blank>, URL=`.../chapter-90`, popular entry 35: title=<blank>, URL=`.../chapter-86`, popular entry 38: title=<blank>, URL=`.../chapter-92`, popular entry 39: title=<blank>, URL=`.../chapter-91`, popular entry 40: title=<blank>, URL=`.../chapter-90`, popular entry 43: title=<blank>, URL=`.../chapter-102`, popular entry 44: title=<blank>, URL=`.../chapter-101`, popular entry 45: title=<blank>, URL=`.../chapter-100`, popular entry 48: title=<blank>, URL=`.../chapter-105`, popular entry 49: title=<blank>, URL=`.../chapter-103`, popular entry 50: title=<blank>, URL=`.../chapter-102` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | UNUSUAL | 51/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://narasininja.net/.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga.jpg` (image/jpeg, 21488 bytes, 250x348) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga` |  |  |  |
| details thumbnail URL | PASS | `https://narasininja.net/.../maryoku-zero-no-saikyou-majutsushi-yahari-omaera-no-majutsu-riron-wa-machigatte-iru-nda-ga.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Abel ingin menjadi penyihir. Ketika dia berusia tujuh tahun, dia diberitahu bahwa dia tidak bisa menjadi penyihir karena dia tidak memiliki kekuatan magis. Terkejut, Abel tidak bisa menjadi penyihir. Karena itu, Abel diusir dari rumah orang tuanya. Meski begitu, Abel terus belajar sihir. Dan kemudian dia menyadari; Bahwa teori-teori sihir yang dikenal di dunia ini pada dasarnya salah. Setelah menyadari kebenaran sihir, Abel menjadi…… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 172 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://yuucdn.com/.../1-616aadb65d4cb.jpg` at pages 1, 37, 62, 130, `https://yuucdn.com/.../2-616aadb7b4c00.jpg` at pages 2, 39, 64, 131, `https://yuucdn.com/.../3-616aadb8db5ab.jpg` at pages 3, 41, 65, 132, `https://yuucdn.com/.../4-616aadba11c97.jpg` at pages 4, 43, 66, 133, `https://yuucdn.com/.../5-616aadbb54999.jpg` at pages 5, 45, 68, 134, `https://yuucdn.com/.../6-616aadbcb4343.jpg` at pages 6, 47, 70, 135, `https://yuucdn.com/.../7-616aadbe0389a.jpg` at pages 7, 49, 71, 136, `https://yuucdn.com/.../8-616aadc0359d0.jpg` at pages 8, 51, 72, 137, `https://yuucdn.com/.../9-616aadc1770ff.jpg` at pages 9, 52, 73, 138, `https://yuucdn.com/.../10-616aadc2b14ca.jpg` at pages 10, 53, 74, 139, `https://yuucdn.com/.../11-616aadc400edd.jpg` at pages 11, 54, 75, 140, `https://yuucdn.com/.../12-616aadc55800a.jpg` at pages 12, 55, 76, 141, `https://yuucdn.com/.../13-616aadc6957de.jpg` at pages 13, 56, 77, 142, `https://yuucdn.com/.../14-616aadc7d9d14.jpg` at pages 14, 57, 79, 143, `https://yuucdn.com/.../15-616aadc92a420.jpg` at pages 15, 58, 82, 144, `https://yuucdn.com/.../16-616aadca69b7c.jpg` at pages 16, 59, 84, 145, `https://yuucdn.com/.../17-616aadcc4a809.jpg` at pages 17, 60, 86, 146, `https://yuucdn.com/.../18-616aadcd8b778.jpg` at pages 18, 61, 87, 147, `https://yuucdn.com/.../19-616aadced3c91.jpg` at pages 19, 63, 89, 148, `https://yuucdn.com/.../20-616aadd029e02.jpg` at pages 20, 67, 90, 149, `https://yuucdn.com/.../21-616aadd16ec7a.jpg` at pages 21, 69, 91, 150, `https://yuucdn.com/.../22-616aadd2abf0a.jpg` at pages 22, 78, 93, 151, `https://yuucdn.com/.../23-616aadd406c2d.jpg` at pages 23, 80, 95, 152, `https://yuucdn.com/.../24-616aadd55f794.jpg` at pages 24, 81, 97, 153, `https://yuucdn.com/.../25-616aadd6c9a88.jpg` at pages 25, 83, 98, 154, `https://yuucdn.com/.../26-616aadd8542df.jpg` at pages 26, 85, 100, 155, `https://yuucdn.com/.../27-616aadd9b7a42.jpg` at pages 27, 88, 102, 156, `https://yuucdn.com/.../28-616aaddb393ad.jpg` at pages 28, 92, 104, 157, `https://yuucdn.com/.../29-616aaddc7d429.jpg` at pages 29, 94, 105, 158, `https://yuucdn.com/.../30-616aadddc10b2.jpg` at pages 30, 96, 108, 159, `https://yuucdn.com/.../31-616aaddf20cae.jpg` at pages 31, 99, 110, 160, `https://yuucdn.com/.../32-616aade0756a6.jpg` at pages 32, 101, 112, 161, `https://yuucdn.com/.../33-616aade1b5df0.jpg` at pages 33, 103, 113, 162, `https://yuucdn.com/.../34-616aade307151.jpg` at pages 34, 106, 115, 163, `https://yuucdn.com/.../35-616aade44efcf.jpg` at pages 35, 107, 117, 164, `https://yuucdn.com/.../36-616aade592688.jpg` at pages 36, 109, 119, 165, `https://yuucdn.com/.../37-616aade6d84b0.jpg` at pages 38, 111, 121, 166, `https://yuucdn.com/.../38-616aade82d5c5.jpg` at pages 40, 114, 123, 167, `https://yuucdn.com/.../39-616aade972c27.jpg` at pages 42, 116, 124, 168, `https://yuucdn.com/.../40-616aadeaca2c7.jpg` at pages 44, 118, 126, 169, `https://yuucdn.com/.../41-616aadec2a7a3.jpg` at pages 46, 120, 127, 170, `https://yuucdn.com/.../42-616aaded72dd9.jpg` at pages 48, 122, 128, 171, `https://yuucdn.com/.../43-616aadeeb5564.jpg` at pages 50, 125, 129, 172 |  |  |  |
| redirects | UNUSUAL | pages: `https://narasininja.net/.../chapter-1` to `https://narasininja.net/.../chapter-1` (1 redirects) |  |  |  |
| page load | PASS | `https://yuucdn.com/.../1-616aadb65d4cb.jpg` (image/jpeg, 120583 bytes, 840x943) |  |  |  |
