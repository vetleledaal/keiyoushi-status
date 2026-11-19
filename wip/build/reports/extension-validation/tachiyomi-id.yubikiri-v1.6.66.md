# Extension Validation Report

- Extension: tachiyomi-id.yubikiri-v1.6.66
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3822381168124807791
- Source name: Kaguya
- Source language: id
- Selected manga input: popular offset 0: Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Milf Hunting in Another World (`.../milf-hunting-in-another-world`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Black Haze (2025) (`.../black-haze-2025`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Female Lead Does It All (`.../the-female-lead-does-it-all`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 51 | Chapter 1 (`.../cmvkvps351yjxwzkgni4hv0uc`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Haimiya-senpai wa Kowakute Kawaii, URL=`.../haimiya-senpai-wa-kowakute-kawaii` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.kaguyacdn.my.id/.../cmr3713dvgoi1ig8yforabs3r_1792290571919.webp` (image/webp (encoding: lossy), 188754 bytes, 1024x1456) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../haimiya-senpai-wa-kowakute-kawaii` |  |  |  |
| details thumbnail URL | PASS | `https://storage.kaguyacdn.my.id/.../cmr3713dvgoi1ig8yforabs3r_1792290571919.webp` |  |  |  |
| details author | PASS | Kamiyama Sumu |  |  |  |
| details artist | PASS | Kamiyama Sumu |  |  |  |
| details genres | PASS | Manga, Comedy, Drama, Romance, Slice of Life, School Life, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Di SMA-ku, Haimiya-senpai ditakuti oleh semua orang dan dianggap terlalu menakutkan. Hal ini tampaknya disebabkan oleh penampilannya yang mengintimidasi dan cara bicaranya yang blak-blakan... serta tindikan-tindikannya yang berkilauan! Rambut panjang bergaya “wolf-cut” berwarna abu-abu! Bahkan aksen Kansai-nya pun terasa mengintimidasi!!!<br>Tapi entah kenapa, senpai yang menakutkan ini justru memperlakukan aku dengan baik...?<br>Saat "menakutkan" berubah menjadi "imut," komedi romantis senpai yang menakutkan (dan bikin deg-degan) ini pun dimulai!<br><br>**Alternative Names:**<br>- 灰宮先輩は怖くてかわいい<br>- Haimiya-Senpai is Scary But Cute<br>- Haimiya-senpai is Cutie Scary |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | PASS | 51 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://tsuki.kaguya.re/.../deliver <redacted query values: token>` at pages 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://tsuki.kaguya.re/.../deliver <redacted query values: token>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
