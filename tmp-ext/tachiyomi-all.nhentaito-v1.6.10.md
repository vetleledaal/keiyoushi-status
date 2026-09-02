# Extension Validation Report

- Extension: tachiyomi-all.nhentaito-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1911624300824763845
- Source name: NHentai.to
- Source language: en
- Selected manga input: latest offset 0: [Marubatsukuru (Reataka)] Saikyou Ansatsusha ga Saiin sarete Buzama ni Okasareru Hanashi (Re:Zero kara Hajimeru Isekai Seikatsu) | A Story About the Strongest Assassin Being Drugged and Humiliatingly Raped (Re:Zero - Starting Life in Another World) [English MTL] (`.../678742`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [Amagami Honpo (Manno)] Iribitari Gal ni Manko Tsukawasete Morau Hanashi 1 - 3 | The Gyaru I Hang Out with Lets Me Use Her Pussy 1 - 3 [English] [Digital] (`.../532611`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | [Kamatsuka (Kamatsuka)] Chichi no Saikon de Doukyo suru Koto ni Natta Gibo no Gijou Shimai to Kawarugawaru Sex shite shimatta Hon | Living with My Stepmom and Stepsisters After Dad's Remarriage and Having Sex with Them All [English] [Digital] (`.../565276`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | [Marubatsukuru (Reataka)] Saikyou Ansatsusha ga Saiin sarete Buzama ni Okasareru Hanashi (Re:Zero kara Hajimeru Isekai Seikatsu) | A Story About the Strongest Assassin Being Drugged and Humiliatingly Raped (Re:Zero - Starting Life in Another World) [English MTL] (`.../678742`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [ties (takei ooki)] Imouto Succubu [Digital] [English] [XO Manga] (`.../678597`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Marubatsukuru (Reataka)] Saikyou Ansatsusha ga Saiin sarete Buzama ni Okasareru Hanashi (Re:Zero kara Hajimeru Isekai Seikatsu) | A Story About the Strongest Assassin Being Drugged and Humiliatingly Raped (Re:Zero - Starting Life in Another World) [English MTL] (`.../678742`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../678742`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zrocdn.xyz/.../thumb.webp` (image/webp (encoding: lossy), 13538 bytes, 500x695) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../678742` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://zrocdn.xyz/.../cover.webp` (image/webp (encoding: lossy), 20118 bytes, 700x973) |  |  |  |
| details author | PASS | reataka |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | beauty mark, big areolae, big breasts, big nipples, bikini, blowjob, blowjob face, double penetration, full color, huge breasts, inverted nipples, kissing, multi-work series, pantyhose, ponytail, rough translation, sole female, swimsuit, very long hair |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies**: re zero kara hajimeru isekai seikatsu<br><br>**Characters**: elsa granhiert<br><br>**Groups**: group<br><br>**Languages**: english, translated<br><br>**Categories**: doujinshi<br><br>**Pages**: 20<br><br>**Alternative title**: \[マルバツクル (れあたか)\] 最強暗殺者が催淫されて無様に犯される話 (Re:ゼロから始める異世界生活) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://zrocdn.xyz/.../1.webp` (image/webp (encoding: lossy), 111916 bytes, 1280x1780) |  |  |  |
