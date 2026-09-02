# Extension Validation Report

- Extension: tachiyomi-pt.fenixproject-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 3
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8852449878379679769
- Source name: Fenix Project
- Source language: pt-BR
- Selected manga input: latest offset 0: As Noites da Imperatriz (`.../as-noites-da-imperatriz`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 99 | Meu Amado Opressor (`.../meu-amado-opressor`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 79 | As 100 Maldições da Casa Illeston (`.../as-100-maldicoes-da-casa-illeston`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 95 | As Noites da Imperatriz (`.../as-noites-da-imperatriz`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 83 | Nesta Vida, Você Será o Cão de Caça (`.../nesta-vida-voce-sera-o-cao-de-caca`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | As Noites da Imperatriz (novel) (`.../as-noites-da-imperatriz-2`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | As Noites da Imperatriz (`.../as-noites-da-imperatriz`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 41 | Capítulo 01 (`https://fenixproject.site/.../capitulo-01`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| popular listing | PASS | 99 entries |  |  |  |
| latest listing | PASS | 95 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=As Noites da Imperatriz, URL=`.../as-noites-da-imperatriz` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 358/358 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 358/358 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fenixproject.site/.../capa-imperatriz-350x476.webp` (image/webp (container: extended), 34936 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../as-noites-da-imperatriz` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://fenixproject.site/.../capa-imperatriz.webp` (image/webp (container: extended), 818030 bytes, 768x1164) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adulto, Angústia, Dark Romance, Drama, Histórico, Tragédia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is blank; use null when unknown |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 41 chapters |  |  |  |
| chapter dates | PASS | 41 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 41 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://fenixproject.site/.../00-majestade.webp` (image/webp (encoding: lossless), 954072 bytes, 2048x1365) |  |  |  |
