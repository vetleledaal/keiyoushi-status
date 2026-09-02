# Extension Validation Report

- Extension: tachiyomi-ja.rawlh-v1.4.18
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
- Source ID: 7595224096258102519
- Source name: WeLoveManga
- Source language: ja
- Selected manga input: latest offset 0: Kamuyomi No Maihito (`.../0PVRv`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Parallel Paradise - Raw (`.../0x4Hj`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | One Punch Man (manga) (`.../0ctK9`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Kamuyomi No Maihito (`.../0PVRv`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | I Should Have Been Reincarnated As A Supporting Role, But Before I Knew It, I Had Become A Legendary Alchemist. (`.../0xKuQ`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kamuyomi No Maihito (`.../0PVRv`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kamuyomi No Maihito (`.../0PVRv`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | 1 (`.../C8AB`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kamuyomi No Maihito, URL=`.../0PVRv` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../kamuyomi-no-maihito_692fda8c67781.jpg <redacted query values: imgmax>` (image/jpeg, 280986 bytes, 320x454) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../0PVRv` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://s4.ihlv1.xyz/.../kamuyomi-no-maihito_692fda8c67781.jpg` (image/jpeg, 280986 bytes, 320x454) |  |  |  |
| details author | PASS | Kamicii Satsuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Historical, Mystery, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kagura of the Crimson Bell — A Taishou Era Divine Mystery Singing and dancing to soothe the gods—this is the sacred performing art known as Kagura. During the Taishō era, in Hiroshima’s Takada District, the Kakukakusho Family leads a Kagura troupe beloved by the locals. But behind their public performances lies a secret duty, one that has been passed down through generations… As supernatural disturbances ripple through Taishō-period Hiroshima, the family’s hidden role draws them into a world where humans and ancient Japanese deities intertwine. A grand tale of divine folklore and mystical drama unfolds—let the Taishou Kagura legend begin!<br><br>Alternative Name: 神詠みの舞人, A dancer who conveys the descent of the gods |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 76 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ihlv1.xyz/.../0d7223ce495923240e5a25ba5056095201.jpg` (image/jpeg, 404710 bytes, 1025x1457) |  |  |  |
