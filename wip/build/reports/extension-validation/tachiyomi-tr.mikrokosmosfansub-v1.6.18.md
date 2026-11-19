# Extension Validation Report

- Extension: tachiyomi-tr.mikrokosmosfansub-v1.6.18
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2294150032592593429
- Source name: Mikrokosmos Fansub
- Source language: tr
- Selected manga input: popular offset 0: Borderline (`.../borderline`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 26 | Borderline (`.../borderline`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 26 | Borderline (`.../borderline`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Borderline (`.../borderline`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Borderline (`.../borderline`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 47 | Tanıtım (`.../c-blogger-1791994883030-0-43`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Borderline, URL=`borderline` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Screenshot_20260603_095528_Instagram1.webp` (image/jpeg, 144403 bytes, 670x873) |  |  |  |
| details identity | PASS | Details preserved selected URL `borderline` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../Screenshot_20260603_095528_Instagram1.webp` |  |  |  |
| details author | PASS | Danrim |  |  |  |
| details artist | PASS | Danrim |  |  |  |
| details genres | PASS | Manhwa, Sansürsüz, Smut, Bl, Drama, Psikolojik, Romantik, Yaşamdan, Gerilim, Yaoi, BL, 18+ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hwang Mok-yeon, yatak arkadaşı Chae Sunhwa ona üçlü birleşme teklif ettiğinde pek de heyecanlanmamıştı; ta ki üçüncü kişinin kim olduğunu öğrenene kadar. Yeni hedefi Eun Nanjo’ydu: Zengin, kibar, her şeyiyle dört dörtlük bir tip... ama Sunhwa’nın dediğine göre yatakta tam bir fiyasko, ölümüne sıkıcı biriydi.<br><br>​Başta her şey sadece meraktan ibaretti. Ancak üçü yatakta birbirine dolandığı an, Mok-yeon gözlerini Nanjo’dan bir an olsun ayıramadığını fark etti. Nanjo’nun derdinin kendisini elde etmek değil de Sunhwa’yı o durumdan kurtarmak olduğunu anladığı an, Mok-yeon tehlikeli bir fısıltıyla o malum teklifi yaptı. Nanjo’ya iyice sokulup nefesini boynuna verdi:<br><br>​"Seni istiyorum. Benim için bacaklarını aralamaya ne dersin?" |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 47 chapters |  |  |  |
| chapter dates | PASS | 47 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../1001910841.png` (image/png, 567211 bytes, 720x1027) |  |  |  |
