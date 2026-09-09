# Extension Validation Report

- Extension: tachiyomi-pt.mangaonline-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7203957529449460928
- Source name: Manga Online
- Source language: pt-BR
- Selected manga input: popular offset 0: Eleceed (`.../eleceed`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Eleceed (`.../eleceed`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Blue Lock (`.../blue-lock`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Star-Embracing Swordmaster (`.../star-embracing-swordmaster`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Escravo Das Sombras (`.../escravo-das-sombras`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Eleceed (`.../eleceed`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Eleceed (`.../eleceed`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 416 | Cap. 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eleceed, URL=`.../eleceed` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaonline.green/.../1787778812278-fbcedd28cfdb.jpg` (image/jpeg, 86820 bytes, 415x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../eleceed` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Artes Marciais, Comédia, Romance, PEAK ARTE, Sobrenatural, Gênio, Vida Escolar, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kaiden – Um usuário misterioso de habilidade que se esconde dentro do corpo de um gato de rua. Mais tarde, ele é pego por Jiwoo depois de ser ferido após uma briga com outro usuário de habilidade. Ele tem uma personalidade teimosa e mandona. Jiwoo – um garoto do ensino médio enérgico e falador que adora gatos. Ele é muito gentil e também parece ter uma habilidade especial. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 416 chapters |  |  |  |
| chapter dates | LINT | All 416 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=416 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangaonline.green/.../1784068350115-2000e556cd53.webp` to `https://cdn.xn--c5wx58dnej.online/.../1784068350115-2000e556cd53.webp` (1 redirects); popular: `https://mangaonline.green/.../1787778812278-fbcedd28cfdb.jpg` to `https://cdn.xn--c5wx58dnej.online/.../1787778812278-fbcedd28cfdb.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://mangaonline.green/.../1784068350115-2000e556cd53.webp` (image/webp (encoding: lossy), 191980 bytes, 800x5000) |  |  |  |
