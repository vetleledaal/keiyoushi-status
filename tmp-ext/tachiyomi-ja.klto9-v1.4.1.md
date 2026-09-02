# Extension Validation Report

- Extension: tachiyomi-ja.klto9-v1.4.1
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
- Source ID: 3136857802804349121
- Source name: Klto9
- Source language: ja
- Selected manga input: latest offset 0: Kamuyomi No Maihito (`.../teap-kamuyomi-no-maihito.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Kimetsu No Yaiba - Raw (`.../teap-kimetsu-no-yaiba-raw.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Shinjiteita Nakama Tachi Ni Dan John Okuchi De Korosarekaketaga Gift Mugen Ga Cha De Level 9999 No Nakama Tachi Wo Te Ni Irete Motoparty Member To Sekai Ni Fukushu Zama A! Shimasu! (`.../teap-shinjiteita-nakama-tachi-ni-dan-john-okuchi-de-korosarekaketaga-gift-mugen-ga-cha-de-level-9999-no-nakama-tachi-wo-te-ni-irete-motoparty-member-to-sekai-ni-fukushu-zama-a-shimasu.html`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Kamuyomi No Maihito (`.../teap-kamuyomi-no-maihito.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Urico (`.../teap-urico.html`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kamuyomi No Maihito (`.../teap-kamuyomi-no-maihito.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | KAMUYOMI NO MAIHITO (`.../teap-kamuyomi-no-maihito.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 10 | Chapter 1 (`.../362262`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 76 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kamuyomi No Maihito, URL=`.../teap-kamuyomi-no-maihito.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://j4.jfimv2.xyz/.../kamuyomi-no-maihito_692fda8c67781.jpg` (image/jpeg, 280986 bytes, 320x454) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Kamuyomi No Maihito to KAMUYOMI NO MAIHITO |  |  |  |
| details thumbnail URL | PASS | `https://j4.jfimv2.xyz/.../kamuyomi-no-maihito_692fda8c67781.jpg` |  |  |  |
| details author | PASS | Kamicii Satsuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Historical, Supernatural, Mystery, Drama, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Other Names: 神詠みの舞人, A dancer who conveys the descent of the gods<br><br>Kagura of the Crimson Bell — A Taishou Era Divine Mystery Singing and dancing to soothe the gods—this is the sacred performing art known as Kagura. During the Taishō era, in Hiroshima’s Takada District, the Kakukakusho Family leads a Kagura troupe beloved by the locals. But behind their public performances lies a secret duty, one that has been passed down through generations… As supernatural disturbances ripple through Taishō-period Hiroshima, the family’s hidden role draws them into a world where humans and ancient Japanese deities intertwine. A grand tale of divine folklore and mystical drama unfolds—let the Taishou Kagura legend begin! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 76 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://j1.jfimv2.xyz/.../0d7223ce495923240e5a25ba5056095201.jpg` (image/jpeg, 404710 bytes, 1025x1457) |  |  |  |
