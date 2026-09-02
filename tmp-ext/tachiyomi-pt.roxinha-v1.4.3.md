# Extension Validation Report

- Extension: tachiyomi-pt.roxinha-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3961079268907869519
- Source name: Roxinha
- Source language: pt-BR
- Selected manga input: latest offset 0: Fui Confundido Com Um Gênio Monstruoso (`.../1031`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | O Mago do Infinito (`.../100`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Fui Jogado em Um Mangá Desconhecido (`.../1431`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Fui Confundido Com Um Gênio Monstruoso (`.../1031`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | A Você, Que Será Minha Ruína (`.../1664`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Fui Confundido Com Um Gênio Monstruoso (`.../1031`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fui Confundido Com Um Gênio Monstruoso (`.../1031`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 118 | Capítulo 0 (`.../77028`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fui Confundido Com Um Gênio Monstruoso, URL=`1031` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://roxinha.online/.../cover_1775943347890.jpg` (image/jpeg, 69186 bytes, 400x572) |  |  |  |
| details identity | PASS | Details preserved selected URL `1031` |  |  |  |
| details thumbnail URL | PASS | `https://roxinha.online/.../cover_1775943347890.jpg` |  |  |  |
| details author | PASS | Desconhecido |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Eu, Kang Woojin, estava largando meu trabalho de design e me tornei um desempregado. No dia seguinte, meu amigo me levou para audições e fui forçado a me apresentar. Quando me deram um roteiro, o espaço vazio apareceu na minha mente e me forçou a reviver o personagem. Fui esfaqueado. Virei um serial killer. Virei um exorcista. Conforme me tornei ator, os mal-entendidos continuaram crescendo dia a dia. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 118 chapters |  |  |  |
| chapter dates | PASS | 118 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
