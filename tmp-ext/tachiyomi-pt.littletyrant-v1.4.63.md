# Extension Validation Report

- Extension: tachiyomi-pt.littletyrant-v1.4.63
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 23
- Lint: 2
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4886334142812146511
- Source name: Little Tyrant
- Source language: pt-BR
- Selected manga input: latest offset 0: Um dia minha irmã morreu (`.../um-dia-minha-irma-morreu-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Limite absoluto (`.../limite-absoluto`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Conforme o seu coração guiar (`.../conforme-o-seu-coracao-guiar`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Um dia minha irmã morreu (`.../um-dia-minha-irma-morreu-2`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Minha Caracol Sexy (`.../minha-caracol-sexy`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Um dia minha irmã morreu (`.../um-dia-minha-irma-morreu-2`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Um dia minha irmã morreu (`.../um-dia-minha-irma-morreu-2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Um dia minha irmã morreu, URL=`.../um-dia-minha-irma-morreu-2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 44/44 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 44/44 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tiraninha.world/.../um-dia-minha-irma-morreu-cover-1785388643878.webp` (image/webp (encoding: lossy), 293028 bytes, 1080x1620) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../um-dia-minha-irma-morreu-2` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tiraninha.world/.../um-dia-minha-irma-morreu-cover-1785388643878-350x476.webp` (image/webp (encoding: lossy), 51640 bytes, 350x476) |  |  |  |
| details author | PASS | --- |  |  |  |
| details artist | PASS | --- |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
