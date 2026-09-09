# Extension Validation Report

- Extension: tachiyomi-en.comix-v1.6.38
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7537715367149829912
- Source name: Comix
- Source language: en
- Selected manga input: latest offset 0: Start by signing in and obtaining the Ancient Divine Body (`.../m6ez-start-by-signing-in-and-obtaining-the-ancient-divine-body`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | On the Way to Meet Mom (`.../g2rk-on-the-way-to-meet-mom`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 28 | The Perks of Being an S-Class Heroine (`.../1w0v-the-perks-of-being-an-s-class-heroine`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | Start by signing in and obtaining the Ancient Divine Body (`.../m6ez-start-by-signing-in-and-obtaining-the-ancient-divine-body`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Hitoribocchi no Isekai Kouryaku (`.../zq523-hitoribocchi-no-isekai-kouryaku`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 28 | Start by signing in and obtaining the Ancient Divine Body (`.../m6ez-start-by-signing-in-and-obtaining-the-ancient-divine-body`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Start by signing in and obtaining the Ancient Divine Body (`.../m6ez-start-by-signing-in-and-obtaining-the-ancient-divine-body`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 240 | Chapter 1 (`.../1911138-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 117 |  |  | <1s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Start by signing in and obtaining the Ancient Divine Body, URL=`.../m6ez-start-by-signing-in-and-obtaining-the-ancient-divine-body` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 139/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.comix.to/.../68e11f1079ee5.jpg` (image/jpeg, 64800 bytes, 400x600; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../m6ez-start-by-signing-in-and-obtaining-the-ancient-divine-body` |  |  |  |
| details thumbnail URL | PASS | `https://static.comix.to/.../68e11f1079ee5.jpg` |  |  |  |
| details author | PASS | Xing Kong (星空社) |  |  |  |
| details artist | PASS | Xing Kong (星空社) |  |  |  |
| details genres | PASS | Manhua, Action, Comedy, Drama, Fantasy, Isekai, Wuxia, Harem, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★☆ 8.5<br><br>Jun Xiaoyao was transported to a mystical world and became the divine child of a Clan of the Ancients. He came to possess an invincible background, unparalleled talents and even a check-in system, enabling him to acquire an Accomplished Sacred Body of the Ancients at the very beginning of his new life.<br><br>He acquired the Divine Elephant Overpowering Force, a six-star reward, checking in at the Old Tablet of Taiyue.<br><br>He acquired the Bones of Supremacy, a seven-star reward, checking in at his Ten Years Old Banquet.<br><br>He acquired the Cauldron of Maternal Qi of All Beings, an eight-star reward, checking in at the Bronze Mystical Hall.<br><br>He acquired the Grand Method of Freedom Melding, a ten-star reward, checking in at the Borderless Ocean.<br><br>He sat on the clouds countless years later, with his sword pointing at the heavens, saying, “I alone shall rule over the heavens and the earth. I shall become the pinnacle at the very end of the mystic path!”<br><br>Year: 2023<br>Language: ZH<br>Content rating: Safe<br>Rank: #635<br>Rated by: 233<br>Followed by: 7986 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 240 chapters |  |  |  |
| chapter dates | PASS | 240 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 117 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://j24n.wowpic2.store/.../bEqPbYfoMT0Gmm3lciqfoDpIzqEFUuKi3R0VvpLI6y4AiVMhaGDNl_Pk4wkijRuo` (image/webp (encoding: lossy), 329792 bytes, 900x1000) |  |  |  |
