# Extension Validation Report

- Extension: tachiyomi-all.hdoujin-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 3677056573528884471
- Source name: HDoujin
- Source language: en
- Selected manga input: popular offset 0: [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 80 | [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 80 | [Sakamoto Shouten (Nishizawa Mizuki)] Gal to Meccha Namahame Nakadashi Ecchi Suru Hanashi #1 | Having Tons of Bareback Sex with Gyarus #1 [English] [Coffedrug] [Digital] (`.../67e029ff4de3`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 80 | [Bowcan] The Scent of You (Comic G-Es 01) [English] [ConTL] [Digital] (`.../a7e8df955ffd`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 80 | [Scarlett Ann] Crimson Desire (`.../da3e21a06eb8`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../f80ff5318f79`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.io.IOException: Open webview to refresh token | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: Open webview to refresh token | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 80 entries |  |  |  |
| latest listing | PASS | 80 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Bad Mushrooms (Chicke III, 4why)\] 1/5 no Renai Kanjou (Gotoubun no Hanayome) \[English\] \[Digital\] \[Sample\], URL=`21950/f80ff5318f79` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 321/321 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 321/321 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://erocdn.net/.../eebdfa7d-020b-4efd-81dd-0f8dca03a4b2.webp` (image/webp (encoding: lossy), 29784 bytes, 250x352) |  |  |  |
| details identity | PASS | Details preserved selected URL `21950/f80ff5318f79` |  |  |  |
| details thumbnail URL | PASS | `https://erocdn.net/.../eebdfa7d-020b-4efd-81dd-0f8dca03a4b2.webp` |  |  |  |
| details author | PASS | Bad Mushrooms |  |  |  |
| details artist | PASS | 4why, Chicke Iii |  |  |  |
| details genres | PASS | 4why, Chicke Iii, Bad Mushrooms, Gotoubun No Hanayome, Fuutarou Uesugi, Ichika Nakano, Nino Nakano, Anal ♀, Blowjob ♀, Garter Belt ♀, Lingerie ♀, Nakadashi ♀, Pantyhose ♀, Pixie Cut ♀, Shimaidon ♀, Stockings ♀, Swimsuit ♀, Condom ♂, Sole Male ♂, Ffm Threesome, Group, Compilation, Rough Translation, Sample |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Circles: Bad Mushrooms<br>Uploaders: Affectionate-Ad-7651<br>Parodies: Gotoubun No Hanayome<br>Characters: Fuutarou Uesugi, Ichika Nakano, Nino Nakano<br><br>Posted: Monday, 30 Dec 2024 18:03 (CET)<br>Pages: 118<br><br>Alternative Title(s): <br>- \[壞茸社 (Chicke III、4why)\] 1/5の恋愛感情 (五等分の花嫁) \[英訳\] \[DL版\] \[見本\], <br>- 1/5の恋愛感情<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Open webview to refresh token |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
