# Extension Validation Report

- Extension: tachiyomi-en.mangadistrict-v1.4.69
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
- Source ID: 2964723819258267786
- Source name: Manga District
- Source language: en
- Selected manga input: latest offset 0: Crawl to Me, My Lady (`.../crawl-to-me-my-lady`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Teach Me first! (Uncensored) (`.../teach-me-first-uncensored`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | The Landlord’s Sister (`.../the-landlords-sister`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Crawl to Me, My Lady (`.../crawl-to-me-my-lady`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Seres’s Resolve: The Battle for Humanity (`.../seress-resolve-the-battle-for-humanity`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Crawl to Me, My Lady (`.../crawl-to-me-my-lady`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Crawl to Me, My Lady (`.../crawl-to-me-my-lady`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | Chapter 1 - Episode 1 (`https://mangadistrict.com/.../chapter-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Crawl to Me, My Lady, URL=`.../crawl-to-me-my-lady` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangadistrict.com/.../crawl-to-me-my-lady-official.webp` (image/webp (encoding: lossless), 197756 bytes, 400x533) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../crawl-to-me-my-lady` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangadistrict.com/.../crawl-to-me-my-lady-official.webp` |  |  |  |
| details author | PASS | Doyeon, serabeee |  |  |  |
| details artist | PASS | Paman |  |  |  |
| details genres | PASS | Borderline H, Drama, Explicit Sex, Fantasy, Full Color, Manhwa, Romance, Smut, Webtoons, Aristocracy, BDSM, Big Breasts, Bondage, Butlers, Domination, Family, Group Sex, Humiliating, Infidelity, Love Triangle, Manipulative, Mansion, Marriage, Married, Married Life, Nobility, Secret Affair, Short Story, Younger Top, Manhwa, Webtoons |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Crawl to Me, My Lady<br><br>As the wife of Duke Edward, the gentlest and most affectionate man in the realm, Duchess Ines appears to have a picture-perfect marriage. However, behind her refined facade lies a shameful secret she could never reveal to her devoted husband: gentle affection leaves her cold, while public degradation and intense humiliation drive her wild with desire. Her secret doesn’t stay hidden for long. Leon, the estate’s calculating head butler, unravels the truth behind his mistress’s taboo cravings. Exploiting her secret, Leon takes full advantage of the shadow of night. While Duke Edward slumbers peacefully just rooms away, the butler freely claims, degrades, and dominates Ines, fulfilling her darkest, most shameful fantasies right under her husband’s nose.<br><br>Alternative Names: Công Tước Phu Nhân Bò Đến Chỗ Quản Gia, The Duchess at the Butler’s Mercy, The Duchess Crawled to Her Butler, 공작부인은 기어서 집사에게로, Gongjakbuineun Gieoseo Jipsaegero |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 10 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.mangadistrict.com/.../01.jpg` (image/jpeg, 3720463 bytes, 1440x10000) |  |  |  |
