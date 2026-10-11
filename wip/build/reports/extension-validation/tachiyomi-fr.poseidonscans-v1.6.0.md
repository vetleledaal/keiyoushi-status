# Extension Validation Report

- Extension: tachiyomi-fr.poseidonscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8936307069044646761
- Source name: Poseidon Scans
- Source language: fr
- Selected manga input: popular offset 0: Demonic emperor (`.../demonic-emperor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Demonic emperor (`.../demonic-emperor`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | My Girlfriend Returned as a Dragon (`.../my-girlfriend-returned-as-a-dragon`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Reformation of the Deadbeat Noble (`.../reformation-of-the-deadbeat-noble`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Demonic emperor (`.../demonic-emperor`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Demonic emperor (`.../demonic-emperor`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 893 | Chapitre 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Demonic emperor, URL=`.../demonic-emperor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://poseidon-scans.net/.../demonic-emperor.webp` (image/webp (encoding: lossy), 46354 bytes, 510x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../demonic-emperor` |  |  |  |
| details thumbnail URL | PASS | `https://poseidon-scans.net/.../demonic-emperor.webp` |  |  |  |
| details author | PASS | Ye Xiao |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Le roi des démons garde un terrible secret convoité par ses ennemis… Mais également par ses amis. Trahi et assassiné par son fidèle le plus proche, il se réincarne dans la peau d’un gamin. Désormais, intendant d’une famille de nobles sans histoire, il a tout le temps pour préparer sa vengeance. Parce qu’il avait l’héritage de l’ancien empereur démoniaque, l’empereur démoniaque Zhuo Yifan a eu la malchance d’être trahi et tué par son disciple de confiance. Après sa renaissance, sa culture est retombée à zéro et il a été piégé par un démon du cœur, n’ayant d’autres choix que de devenir la gouvernante de l’aînée de la famille Luo. Du statut d’Empereur Magique à celui d’homme de ménage insignifiant, comment allait-il s’entendre avec son « aîné démon du cœur » et quel pouvoir allait-il acquérir afin de se hisser, lui et sa famille en déclin, au sommet du continent ?<br><br>\[Note : 魔 peut signifier « magie » et « démon », tandis que 管家 peut signifier « majordome » et « gouvernante ». Je ne sais pas trop pourquoi le traducteur précédent a décidé d’utiliser « Magie » alors qu’il s’agit d’un monde de culture, mais je vais suivre. (Et Zhou Fan ne fait jamais le travail d’une gouvernante dans tout le manhua.)\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 893 chapters |  |  |  |
| chapter dates | PASS | 893 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://poseidon-scans.net` to `https://poseidon-scans.net <redacted query values: _rsc>` (1 redirects); popular: `https://poseidon-scans.net/.../demonic-emperor` to `https://poseidon-scans.net/.../demonic-emperor <redacted query values: _rsc>` (1 redirects); popular: `https://poseidon-scans.net/.../1` to `https://poseidon-scans.net/.../1 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://poseidon-scans.net/.../f64117f2-c92e-4d09-8c9d-ece5e174fd01` (image/webp (container: extended), 16990 bytes, 591x183) |  |  |  |
