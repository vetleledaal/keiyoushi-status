# Extension Validation Report

- Extension: tachiyomi-pt.taimumangas-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8914871231496469978
- Source name: Taimu Mangas
- Source language: pt-BR
- Selected manga input: latest offset 0: Eu Amo Yoo (`.../317399542691`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Por Favor me dê Essa Chupeta (`.../568476022087`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Amor:Zero (`.../934109489739`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Eu Amo Yoo (`.../317399542691`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Debutar Ou Morrer (`.../675852116261`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Eu Amo Yoo (`.../317399542691`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Eu Amo Yoo (`.../317399542691`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 117 | Capitulo 1 (`.../711641157780`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eu Amo Yoo, URL=`317399542691` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.taimumangas.com/.../dc8ef061-0b69-460b-910d-62828e91d43c.png` (image/png, 2869873 bytes, 1600x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `317399542691` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.taimumangas.com/.../dc8ef061-0b69-460b-910d-62828e91d43c_lg.webp` (image/webp (encoding: lossy), 94674 bytes, 600x600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Slice of Life, Comédia, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Atormentada pela dor e pelo infortúnio desde o início, Shin-Ae decide que não quer se relacionar com outras pessoas nem viver um romance. Embora satisfeita com sua existência antissocial, entediante e sem amor, seu estilo de vida é desafiado depois que ela estraga as roupas de um estranho desavisado.<br><br>Tipo: manhwa<br><br>Scanlator: Yoru Scanlator |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 117 chapters |  |  |  |
| chapter dates | PASS | 117 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.taimumangas.com/.../001.webp` (image/webp (encoding: lossy), 5116 bytes, 800x914) |  |  |  |
